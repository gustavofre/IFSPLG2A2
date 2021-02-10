package Lista3;

public class Mecanico extends Pessoa {

	private String especialidade;
	
	public Mecanico (String nome, String cpf, String especialidade) {
		super(nome, cpf);
		this.especialidade = especialidade;
	}

	public String toString () {
		return "Nome: "+ super.getNome() + "Especialidade: " + especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
		
}
