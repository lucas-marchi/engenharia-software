/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IProduto;
import java.util.ArrayList;

/**
 *
 * @author Kaique
 */
public class Produto implements IProduto{

    public String nome;
    public String descricao;
    public float valor;
    public ArrayList<Adicional> adidional = new ArrayList<Adicional>();
    
    
    public Produto(String nome, float valor){
        this.nome= nome;
        this.valor = valor;
    }
    

    @Override
    public void onAdicional(Adicional ad) {
        this.valor += ad.getValor();
        this.adidional.add(ad);
    }

    @Override
    public void onRemoverAdicional(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createLanche(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void createProduto(String nome, float valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public String toString(){
        return "Nome: " + this.nome + " Valor R$: " + this.valor;
    }

    
}
