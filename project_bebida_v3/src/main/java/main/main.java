package main;

import enums.EnumPagamentoType;
import models.Adicional;
import models.Cadastro;
import models.EnumLanche;
import models.Pedido;
import models.Produto;
import models.financeiro.Caixa;
import models.financeiro.Pagamento;



public class main {
   public static Adicional  onCreateAdicional(String nome, float valor){
       System.out.println("CRIANDO ADICIONAL"); 
       Adicional adicional = new Adicional(nome, valor);
       return adicional;
   }
   public static Produto cirarProduto(String nome, float valor){
       //ESSE BLOCO É PARA CRIAÇÃO DE UMA PEDIDA  PARA ANTES SEJA FINALIZADA
       System.out.println("CRIANDO ITEM PARA PEDIDO");   
       Produto produto = new Produto(nome, valor);
       System.out.println("produto: " + produto.toString());   
       return produto;
   }
   public static Pagamento registrarPagmaento(float valor, EnumPagamentoType t){
       Pagamento pagamento = new Pagamento(valor, t);
       return pagamento;
   }
   public static void main (String[] args)
    {
        System.out.println("======================================"); 
        System.out.println("ABRINDO CAIXA");
        Caixa caixa = new Caixa(25);
        System.out.println("DETALHES CAIXA = " + caixa.toString());
        System.out.println("======================================");  
        System.out.println("ATENDENDO CLIENTE");  
        System.out.println("CRIANDO UM CLIENTE");  
        //Cadastro cliente = new Cadastro('kaique', 'Andrade');
        Cadastro cliente = new Cadastro("kaique", "Andrade");
        System.out.println("cliente: "+ cliente.toString());  
        System.out.println("======================================");  
        System.out.println("Abrindo pedido para cliente"); 
        Pedido _pedido = new Pedido(cliente);
        System.out.println("Detalhes " + _pedido.toString());
        System.out.println("======================================"); 
        System.out.println("PEDIDO ABERTO PRONTO PARA INSERIR PRODUTOS"); 
        System.out.println("======================================");  
        Produto produto = cirarProduto("X-CALABRESA", (float) 17.5);
        System.out.println("Produto criado: " + produto.toString()); 
        System.out.println("DESEJA ADICIONAR UM ADICIONAL AO SEU LANCHE?");   
        Adicional adicional = onCreateAdicional("Bacon", (float) 2.5);
        System.out.println("Adicional: " + adicional.toString()); 
        produto.onAdicional(adicional);
        System.out.println("inserindo adicional no lanche total R$: " + produto.toString()); 
        System.out.println("======================================"); 
        System.out.println("CONFIMANDO E INSRINDO NO PEDIDO"); 
        _pedido.pushProduto(produto);
        System.out.println("inserindo produto no pedido total R$: " + _pedido.toString()); 
        System.out.println("ESPERE CAIXA REGISTRANDO PEDIDO"); 
        caixa.registerPedido(_pedido);
        System.out.println("======================================"); 
        System.out.println("DESEJA RELAIZAR PAGAMENTO"); 
       // String statusPagamento = _pedido.registerPagamento((float)15.00, EnumPagamentoType.DINHEIRO);
        String statusPagamento = caixa.registerPagamento((float) 35.00, EnumPagamentoType.DINHEIRO, 5);
        System.out.println("Pagamento: " + statusPagamento); 
        System.out.println("======================================"); 
        System.out.println("======================================"); 
        System.out.println("DESEJA EMITIR NOTA?"); 
        System.out.println("emitindo uma nota"); 
        
    }
}
