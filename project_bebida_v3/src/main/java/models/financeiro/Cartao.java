package models.financeiro;

import models.Alimentacao;
import models.Credito;
import models.Debito;

public class Cartao {

	private int id;

	private String bandeira;

	private String tipo;

	private Pagamento pagamento;

	private Credito credito;

	private Debito debito;

	private Alimentacao alimentacao;

}
