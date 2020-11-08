package com.accenture.gama.viajei.service.pagarme;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.accenture.gama.viajei.model.pagamento.DadosCartao;
import com.accenture.gama.viajei.model.pagamento.DadosPagamento;

import me.pagar.model.Address;
import me.pagar.model.Billing;
import me.pagar.model.Customer;
import me.pagar.model.Document;
import me.pagar.model.Item;
import me.pagar.model.PagarMeException;
import me.pagar.model.Shipping;
import me.pagar.model.Transaction;

@Service
public class PagarmeService {

	public Transaction criarTransacao() throws PagarMeException {
		Transaction transaction = new Transaction();
		Customer customer = new Customer();
		customer.setType(Customer.Type.INDIVIDUAL);
		customer.setExternalId("1001");
		customer.setName("Phineas Flynn");
		customer.setBirthday("1999-07-09");
		customer.setEmail("phineas@threestatearea.com");
		customer.setCountry("br");

		Collection<Document> documents = new ArrayList<>();
		Document document = new Document();
		document.setType(Document.Type.CPF);
		document.setNumber("77551442758");
		documents.add(document);
		customer.setDocuments(documents);

		Collection<String> phones = new ArrayList<>();
		phones.add("+5511982657575");
		customer.setPhoneNumbers(phones);

		Billing billing = new Billing();
		billing.setName("Phineas Flynn");
		Address address = new Address();
		address.setCity("Santo Andre");
		address.setCountry("br");
		address.setState("sp");
		address.setNeighborhood("Parque Miami");
		address.setStreet("Rua Rio Jari");
		address.setZipcode("09133180");
		address.setStreetNumber("7");
		billing.setAddress(address);

		Shipping shipping = new Shipping();
		shipping.setAddress(address);
		shipping.setName("Phineas Flynn");
		shipping.setFee(3200);

		Collection<Item> items = new ArrayList<>();
		Item item = new Item();
		item.setId("OX890");
		item.setQuantity(12);
		item.setTangible(Boolean.TRUE);
		item.setTitle("Rockets");
		item.setUnitPrice(120);

		DadosPagamento pagamento = initDadosPagamento();

		transaction.setShipping(shipping);
		transaction.setBilling(billing);
		transaction.setItems(items);
		transaction.setPaymentMethod(Transaction.PaymentMethod.CREDIT_CARD);
		transaction.setAmount(pagamento.getValorCobrado());
		transaction.setCardHolderName(pagamento.getDadosCartao().getNomeTitular());
		transaction.setCardNumber(pagamento.getDadosCartao().getNumeroCartao());
		transaction.setCardCvv(pagamento.getDadosCartao().getCvvCartao());
		transaction.setCardExpirationDate(pagamento.getDadosCartao().getDataExpiracao());
		transaction.setCustomer(customer);

		return transaction.save();

	}

	private DadosPagamento initDadosPagamento() {

		DadosPagamento pagamento = new DadosPagamento();

		pagamento.setValorCobrado(1000);
		DadosCartao cartao = new DadosCartao();
		cartao.setNomeTitular("John Kenedy");
		cartao.setCvvCartao("355");
		cartao.setNumeroCartao("3451354212346542");
		cartao.setDataExpiracao("0422");
		pagamento.setDadosCartao(cartao);
		return pagamento;

	}

}
