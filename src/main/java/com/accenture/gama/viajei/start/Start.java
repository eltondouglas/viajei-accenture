package com.accenture.gama.viajei.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accenture.gama.viajei.model.gestao.Operador;
import com.accenture.gama.viajei.model.perfil.Role;
import com.accenture.gama.viajei.repository.RoleRepository;
import com.accenture.gama.viajei.service.cadastro.CadastroService;



@Component
public class Start {
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private CadastroService service;
	
	public void init() {
		roles();
		operadorAdmin();
	}
	
	private void roles() {
		Role role = new Role("ADMIN");
		roleRepository.save(role);
		
		role = new Role("USER");
		roleRepository.save(role);
		
	}
	private void operadorAdmin() {
		
		Operador admin = new Operador();
		admin.setLogin("admin");
		admin.setNome("AMINISTRADOR");
		admin.addRole(new Role("ADMIN"));;
		admin.setSenha("admin");
		service.save(admin);
		
	}
	
}
