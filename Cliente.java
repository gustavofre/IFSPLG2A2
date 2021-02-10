package Lista3;

public class Cliente extends Pessoa {

	/*Atributos*/
	private String telefone; 
	
	/* Construtores */
	public Cliente (String nome, String cpf, String telefone) {
		super (cpf, nome);
		this.telefone = telefone;		
	}

	
	/* Métodos */
	
	public String toString() {
		return "Nome " + super.getNome() + " telefone: " + telefone;
	}
	
	
	/* Getters e Setters */
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
