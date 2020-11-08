package com.accenture.gama.viajei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.gama.viajei.model.gestao.Operador;


public interface OperadorRepository extends JpaRepository<Operador, Integer> {
	Operador findByLogin(String login);
	boolean existsByLogin(String login);
}
