package com.accenture.gama.viajei.model.cadastro;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.accenture.gama.viajei.model.cadastro.enumns.TipoDocumento;


@Embeddable
public class Documento {

	@Column(name = "numero_documento", length = 30)
	private String numeroDocumento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_docto", length = 10)
	private TipoDocumento tipoDocumento;

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
	
}
