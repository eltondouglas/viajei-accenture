package com.accenture.gama.viajei.service.reserva;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accenture.gama.viajei.service.pagarme.PagarmeService;
import com.accenture.gama.viajei.model.cadastro.Viajante;
import com.accenture.gama.viajei.model.dto.ViajanteReservaDTO;
import com.accenture.gama.viajei.model.viajem.Reserva;
import com.accenture.gama.viajei.model.viajem.enumns.ReservaStatus;
import com.accenture.gama.viajei.repository.ReservaRepository;
import com.accenture.gama.viajei.repository.ViajanteRepository;

import me.pagar.model.PagarMeException;
import me.pagar.model.Transaction;
import me.pagar.model.Transaction.Status;


@Component
public class ReservaService {
	
	@Autowired
	private ViajanteRepository viajanteRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	@Autowired
	private PagarmeService pagService;
	
	
	public ViajanteReservaDTO viajanteReservas(Integer viajanteId, LocalDateTime inicio, LocalDateTime fim) {
		ViajanteReservaDTO detalhe = new ViajanteReservaDTO();
		Optional <Viajante> viajante = viajanteRepository.findById(viajanteId);
		detalhe.setViajante(viajante.get());
		detalhe.setReservas(listarReservas(viajanteId, inicio, fim));
		return detalhe;
		
	}
	private List<Reserva> listarReservas(Integer viajanteId, LocalDateTime inicio, LocalDateTime fim) {
		
		List<Reserva> findByDataHoraBetween = reservaRepository.findByViajanteIdAndDataHoraBetween(viajanteId, inicio, fim);
		return findByDataHoraBetween;
	}
	
	public void confirmarPagamento(String orderId) {
		Reserva reserva = reservaRepository.findByOrdemId(orderId);
		try {
			if(reserva!=null) {
				Transaction ts = pagService.criarTransacao();
				if(ts.getStatus()== Status.REFUSED) {
					reserva.setPagamentoId(ts.getId());
					reserva.setStatus(ReservaStatus.PG);
					reservaRepository.save(reserva);
				}
				
			}
		} catch (PagarMeException e) {
			e.printStackTrace();
		}
	}
}
