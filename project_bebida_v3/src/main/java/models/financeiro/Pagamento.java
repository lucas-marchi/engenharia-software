/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.financeiro;

import enums.EnumPagamentoType;
import interfaces.ABPagamento;

/**
 *
 * @author Kaique
 */
public class Pagamento extends ABPagamento {
    	private int id;

	private boolean status;

	private EnumPagamentoType tipo;

        private float valor;
     
        public Pagamento(float valor, EnumPagamentoType ts){
            this.valor = valor;
            this.tipo = ts;
        }
   
        @Override
        public String toString(){
         return "Pagamento : ";
        }
}
