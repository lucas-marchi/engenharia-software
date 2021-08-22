package interfaces;


import enums.EnumPagamentoType;
import models.financeiro.Pix;
import models.financeiro.Nota;
import models.financeiro.Boleto;
import models.financeiro.Cartao;
import models.financeiro.Caixa;
import models.Pedido;
import models.financeiro.Dinheiro;
import models.financeiro.Boleto;
import models.financeiro.Caixa;
import models.financeiro.Cartao;
import models.financeiro.Nota;
import models.financeiro.Pix;

public abstract class ABPagamento {

	private int id;

	private boolean status;

	private EnumPagamentoType tipo;

        private float valor;
     
        public void Pagamento(float valor, EnumPagamentoType ts){
            this.valor = valor;
            this.tipo = ts;
        }
}
