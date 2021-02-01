package atividade1;

public class Pessoa {
	
	private String nome;
	private int dtnascimento;
	private double altura;
	private int idade;
	
	// Getters e Setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDtnascimento() {
		return dtnascimento;
	}
	public void setDtnascimento(int dtnascimento) {
		this.dtnascimento = dtnascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimirDadosPessoa () {
		System.out.println("O " + nome + " nasceu em " + dtnascimento +  " e " + altura + " de altura" + " com " + calculoIdade(idade) + " de idade ");
	}
	
	public int calculoIdade(int idade) {
		
		idade = 2020 -  this.dtnascimento;
		this.idade = idade;
		return this.idade;
	}
	

	
	
}
