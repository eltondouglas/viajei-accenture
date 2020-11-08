package com.accenture.gama.viajei.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.gama.viajei.model.cadastro.Viajante;
import com.accenture.gama.viajei.model.enums.Roles;
import com.accenture.gama.viajei.repository.ViajanteRepository;
import com.accenture.gama.viajei.service.cadastro.CadastroService;

@RestController
@RequestMapping("/viajantes")
public class ViajanteController {
	@Autowired
	private ViajanteRepository repository;
	
	@Autowired
	private CadastroService service;
	
	
	@GetMapping
	@PreAuthorize(Roles.PRE_ADMIN)
	public Iterable<Viajante> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public Integer save(@RequestBody Viajante cliente) {
		return service.save(cliente);
	}
	
	@PutMapping
	@PreAuthorize(Roles.PRE_ADMIN)
	public void update(@RequestBody Viajante cliente) {
		service.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize(Roles.PRE_ADMIN)
	public void delete(@PathParam("id") Integer id) {
		repository.deleteById(id);
	}
}
