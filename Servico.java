package Lista3;

public class Servico {
	
	/* Atributos */
	private int codigo; 
	private String nome; 
	private double valor; 
	
	/* Construtores */
	public Servico(int codigo, String nome, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	/* Métodos */
	public String toSting() {
		return "";
	}

	/* Getters e Setters */
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
