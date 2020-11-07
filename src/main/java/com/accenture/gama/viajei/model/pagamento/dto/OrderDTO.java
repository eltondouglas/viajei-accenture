package com.accenture.gama.viajei.model.pagamento.dto;

import javax.validation.constraints.NotNull;

public class OrderDTO {

	@NotNull(message = "O id da ordem deve ser preenchido")
	private String orderID;

	public String getOrderID() {
		return orderID;
	}

}
