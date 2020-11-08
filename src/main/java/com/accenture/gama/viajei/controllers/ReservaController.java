package com.accenture.gama.viajei.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.gama.viajei.model.dto.ViajanteReservaDTO;
import com.accenture.gama.viajei.service.reserva.ReservaService;



@RestController
@RequestMapping("/reservas")
public class ReservaController {
	@Autowired
	private ReservaService service;
	
	@GetMapping()
	public ViajanteReservaDTO getReservas(@RequestParam("viajanteId") Integer viajanteId, @RequestParam("inicio") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime inicio, @RequestParam("fim") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime fim ) {
		return service.viajanteReservas(viajanteId, inicio, fim);
	}
	
	@GetMapping("/pagamento")
	public void getReservas(@RequestParam("orderId") String orderId) {
		service.confirmarPagamento(orderId);
	}
}
