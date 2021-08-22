package interfaces;


import java.util.ArrayList;
import models.financeiro.Nota;
import models.Cadastro;
import models.Produto;

import models.financeiro.Caixa;
import models.financeiro.Pagamento;


public abstract class ABPedido {

	private int id;

	private double total;

	private double desconto;

	private double subtotal;

	private Nota nota;

	private ArrayList<Produto> produto;

	private Cadastro cliente;

	private Pagamento pagamento;


        
	public double getValor() {
		return 0;
	}


}
