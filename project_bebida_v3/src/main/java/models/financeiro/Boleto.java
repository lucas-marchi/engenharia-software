package models.financeiro;

import java.util.Date;

public class Boleto {

	private int id;

	private String codigobarra;

	private Date date;

	private Date vencimento;

	private float valor;

	private Boleto boleto;

	private Pagamento pagamento;

}
