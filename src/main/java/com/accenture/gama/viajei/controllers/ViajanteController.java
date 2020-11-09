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
import com.accenture.gama.viajei.model.dto.ViajanteDTO;
import com.accenture.gama.viajei.model.enums.Roles;
import com.accenture.gama.viajei.repository.ViajanteRepository;
import com.accenture.gama.viajei.service.cadastro.CadastroService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
@RequestMapping("/viajantes")
public class ViajanteController {
	@Autowired
	private ViajanteRepository repository;
	
	@Autowired
	private CadastroService service;
	
	
	@GetMapping
	@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
	@PreAuthorize(Roles.PRE_USER_ADMIN)
	public Iterable<Viajante> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
	@PreAuthorize(Roles.PRE_USER_ADMIN)
	public Integer save(@RequestBody ViajanteDTO cliente) {
		return service.save(cliente.toViajante());
	}
	
	@PutMapping
	@PreAuthorize(Roles.PRE_USER_ADMIN)
	@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
	public void update(@RequestBody ViajanteDTO cliente) {
		service.save(cliente.toViajante());
	}
	
	@DeleteMapping("/{id}")
	@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
	@PreAuthorize(Roles.PRE_USER_ADMIN)
	public void delete(@PathParam("id") Integer id) {
		repository.deleteById(id);
	}
}
