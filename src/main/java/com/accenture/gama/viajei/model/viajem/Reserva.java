package com.accenture.gama.viajei.model.viajem;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.accenture.gama.viajei.model.viajem.enumns.ReservaStatus;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "ordem_id")
	private String ordemId;

	private BigDecimal preco;
	
	@Column(name = "dh_reserva")
	private LocalDateTime dataHora = LocalDateTime.now();

	@Column(name = "pagamento_id")
	private Integer pagamentoId;

	@Enumerated(EnumType.STRING)
	private ReservaStatus status;

	@Column(name = "viajante_id")
	private Integer viajanteId;

	public void setViajanteId(Integer viajanteId) {
		this.viajanteId = viajanteId;
	}

	public Integer getViajanteId() {
		return viajanteId;
	}

	public String getOrdemId() {
		return ordemId;
	}

	public void setOrdemId(String ordemId) {
		this.ordemId = ordemId;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getPagamentoId() {
		return pagamentoId;
	}

	public void setPagamentoId(Integer pagamentoId) {
		this.pagamentoId = pagamentoId;
	}

	public ReservaStatus getStatus() {
		return status;
	}

	public void setStatus(ReservaStatus status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

}
