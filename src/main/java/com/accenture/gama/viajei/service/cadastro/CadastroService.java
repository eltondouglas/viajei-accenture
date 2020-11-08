package com.accenture.gama.viajei.service.cadastro;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.accenture.gama.viajei.model.cadastro.Viajante;
import com.accenture.gama.viajei.model.gestao.Operador;
import com.accenture.gama.viajei.model.perfil.Role;
import com.accenture.gama.viajei.model.perfil.Usuario;
import com.accenture.gama.viajei.repository.UsuarioRepostiry;



@Service
public class CadastroService {
	
		
	@Autowired
	private UsuarioRepostiry userRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	private Integer saveUsuario(Usuario usuario) {
	
		String senhaCriptografada = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaCriptografada);
	
		if(!userRepository.existsByLogin(usuario.getLogin())) {
			usuario = userRepository.save(usuario);
			return usuario.getId();
		}
		return null;
	}
	public Integer save(Operador operador) {
		return saveUsuario(operador);
	}
	
	public Integer save(Viajante cliente) {
		if(cliente.getId()==null) {
			cliente.setRoles(new HashSet<>());
			cliente.addRole(new Role("USER"));
		}
		 return saveUsuario(cliente);
		
	}
	
	
}
