package models;

public class Cadastro {

	public String firstname;

	public String lastname;

	private String cpf;

	private String rg;

	private Pedido pedido;

	private User user;

    public Cadastro(String firsName, String lastName){
        this.firstname = firsName;
        this.lastname = lastName;
    }
    @Override
    public String toString(){
        return "Nome: " + this.firstname + " Sobrenome: " + this.lastname;
    }
}
