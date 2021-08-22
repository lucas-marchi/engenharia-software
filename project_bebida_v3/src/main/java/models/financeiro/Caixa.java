package models.financeiro;


import enums.EnumPagamentoType;
import interfaces.Icaixa;
import java.util.ArrayList;
import models.Adicional;
import models.Cadastro;
import models.Pedido;
import models.Produto;
import java.util.ArrayList;
import models.Adicional;
import models.Cadastro;
import models.Pedido;
import models.Produto;

public class Caixa implements Icaixa {

	private int id;
        
        private float saldo;
        
	private int comanda_caicaID;

	private Pagamento pagamento;
        
	private Caixa caixa;

	private receita receita;

	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	private Nota nota;
          
   public Caixa (float saldo){
       this.saldo = saldo;
   }
   public void emitirNota(int pedidoId){
       for (Pedido pedido: this.pedidos) {
           pedido.toString();
        }
   }
    public String registerPagamento(float valor, EnumPagamentoType tipo, int pedidoId){
        String string = "";
        for (Pedido pedido: this.pedidos) {
            pedido.toString();
            if(pedido.getID() == pedidoId){
                if(valor < pedido.getValor()){
                string += "valor insuficiente!!";
                }else{
                    pedido.registerPagamento(new Pagamento(valor, tipo));
                    string += "Efetuado!";
                }
            }
        }
        return string;
    }
        
    @Override
    public String toString(){
        return "Caixa Aberto saldo para trocos disponivel R$: " + this.saldo;
    }

    @Override
    public float getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean openPedido(Cadastro _cliente) {
        try{
           this.pedidos.add(new Pedido(_cliente));
           return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public void registerPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    @Override
    public void adicionarDecorador(int IdProduto, Adicional adicional) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
