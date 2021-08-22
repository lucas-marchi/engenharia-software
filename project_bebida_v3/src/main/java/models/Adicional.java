package models;

import interfaces.IAdicional;

public class Adicional implements IAdicional {

	private String nome;

	private float valor;

    public Adicional(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getValor() {
        return this.valor;
    }

       @Override
    public String toString(){
        return "Nome : " + this.nome + " Valor R$: " + this.valor;
    }

}
