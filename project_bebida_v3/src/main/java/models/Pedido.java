/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import enums.EnumPagamentoType;
import interfaces.ABPedido;
import interfaces.IPedido;
import java.util.ArrayList;
import models.financeiro.Nota;
import models.financeiro.Pagamento;

/**
 *
 * @author Kaique
 */
public class Pedido extends ABPedido {

    	private int id;

	private double total = 0;

	private double desconto=0;

	private ArrayList<Produto> produto = new ArrayList<Produto>();

	private Cadastro cliente;

	private Pagamento pagamento;

        public Pedido(Cadastro _cliente){
            this.id = 5;
            this.cliente = _cliente;
        }
        public int getID(){
            return this.id;
        }
	public double getValor() {
		return this.total - this.desconto;
	}
        public void pushProduto(Produto produto){
            this.total += produto.valor;
            this.produto.add(produto);
        }
        public void desconto(float desconto){
            this.desconto = desconto;
        }
        
        public void registerPagamento(Pagamento pagamento){
           this.pagamento = pagamento;

        }
        @Override
        public String toString(){
         return "id " +this.id + "Cliente : " + this.cliente.firstname + " Valor R$: " + (this.total - this.desconto + "Pagamento: ");
        }
}
