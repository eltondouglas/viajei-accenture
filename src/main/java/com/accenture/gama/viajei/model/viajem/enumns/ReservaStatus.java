package com.accenture.gama.viajei.model.viajem.enumns;

public enum ReservaStatus {
	PG("PAGO"),
	PP("PENDENTE"),
	ES("ESTORNADO"),
	RS("RECUSADO");
	
	private String descricao;
	
	ReservaStatus(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
