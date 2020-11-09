package com.accenture.gama.viajei.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.gama.viajei.model.dto.Credencial;
import com.accenture.gama.viajei.model.dto.Login;
import com.accenture.gama.viajei.model.dto.ViajanteDTO;
import com.accenture.gama.viajei.model.perfil.Usuario;
import com.accenture.gama.viajei.repository.UsuarioRepostiry;
import com.accenture.gama.viajei.security.JwtTokenProvider;
import com.accenture.gama.viajei.service.cadastro.CadastroService;


@RestController
@RequestMapping("/")
public class AutenticacaoController {
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenProvider jwtTokenUtil;
	
	@Autowired
	private CadastroService service;
	
	@Autowired
	private UsuarioRepostiry userRepository;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/signin")
	public void signin(@RequestBody ViajanteDTO viajante) {		
		service.save(viajante.toViajante());
	}
	    
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Login login) {
		
		Usuario user = userRepository.findByLogin(login.getUsuario());
		
		final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                		login.getUsuario(),
                		login.getSenha()
                )
        );
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		final String token = jwtTokenUtil.generateToken(authentication);
        Credencial credencial= new Credencial();
        credencial.setLogin(login.getUsuario());
        credencial.setToken(token);
        credencial.setUserId(user.getId());;
      
		return ResponseEntity.ok(credencial);
		
        
	}
}
