package com.accenture.gama.viajei.model.dto;

import java.util.List;

import com.accenture.gama.viajei.model.cadastro.Viajante;
import com.accenture.gama.viajei.model.viajem.Reserva;

public class ViajanteReservaDTO {

	private Viajante viajante;
	private List<Reserva> reservas;

	public Viajante getViajante() {
		return viajante;
	}

	public void setViajante(Viajante viajante) {
		this.viajante = viajante;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
