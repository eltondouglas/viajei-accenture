package com.accenture.gama.viajei.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.accenture.gama.viajei.model.viajem.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Integer>{
	
	 List<Reserva> findByViajanteIdAndDataHoraBetween(Integer viajanteId, LocalDateTime inicio, LocalDateTime fim);
	 Reserva findByReservaId(String orderId);
}
