package com.accenture.gama.viajei.model.pagamento;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class DadosPagamento {

	@Valid
	private DadosCartao dadosCartao;
	@NotNull(message = "O valor cobrado deve ser preenchido")
	private Integer valorCobrado;

	public Integer getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(Integer valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public DadosCartao getDadosCartao() {
		return dadosCartao;
	}

	public void setDadosCartao(DadosCartao dadosCartao) {
		this.dadosCartao = dadosCartao;
	}

}


