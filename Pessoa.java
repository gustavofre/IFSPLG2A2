package Lista3;

public class Pessoa {

	/* Atributos */
	private String cpf;
	private String nome; 
	
	
	/* Construtores */
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Pessoa () {}

	
	/* Métodos */	
	@Override
	public String toString() {
		return "";
	}
	
	
	/* Getters e Setters */
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
