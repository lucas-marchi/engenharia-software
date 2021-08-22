package models.financeiro;


import models.financeiro.Caixa;
import models.Pedido;

public class Nota {

	private int id;

	private float valor;
        public float desconto;
	private Pagamento pagamento;
        
        @Override
        public String toString(){
         return "Valor R$ : " + this.valor + "Desconto R$: " + this.desconto;
         
        }
}
