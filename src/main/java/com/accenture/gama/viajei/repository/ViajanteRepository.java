package com.accenture.gama.viajei.repository;

import org.springframework.data.repository.CrudRepository;

import com.accenture.gama.viajei.model.cadastro.Viajante;


public interface ViajanteRepository extends CrudRepository<Viajante, Integer> {
	boolean existsByEmail(String email);

	Viajante findFirstByEmail(String email);
}
