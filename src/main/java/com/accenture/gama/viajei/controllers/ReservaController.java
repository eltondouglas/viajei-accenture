package com.accenture.gama.viajei.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.gama.viajei.model.dto.PagamentoDTO;
import com.accenture.gama.viajei.model.dto.ViajanteReservaDTO;
import com.accenture.gama.viajei.model.enums.Roles;
import com.accenture.gama.viajei.model.viajem.Reserva;
import com.accenture.gama.viajei.service.reserva.ReservaService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
	@Autowired
	private ReservaService service;

	@GetMapping()
	@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
	@PreAuthorize(Roles.PRE_USER_ADMIN)
	public ViajanteReservaDTO getReservas(@RequestParam("viajanteId") Integer viajanteId,
			@RequestParam("inicio") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime inicio,
			@RequestParam("fim") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime fim) {
		return service.viajanteReservas(viajanteId, inicio, fim);
	}

	@PostMapping("/pagamento")
	@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
	@PreAuthorize(Roles.PRE_USER_ADMIN)
	public Reserva criarPagamento(@RequestBody PagamentoDTO orderId) {
		return service.confirmarPagamento(orderId);
	}
}
