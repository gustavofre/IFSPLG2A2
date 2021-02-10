package Lista3;

import java.util.List;

public class Oficina {

	/* Atributos */ 
	private List<OrdemServico> ordensServico;
	
	/* Construtores */
	public Oficina () {}
	
	
	/* Métodos */
	public void adicionaOS(OrdemServico os) {
		ordensServico.add(os);
	}
	
	public List<OrdemServico> buscaOSServico (int codigo){
		ordensServico.contains(codigo);
		return ordensServico;
	}

	 public List<OrdemServico> buscaOSMecanico (String cpf){
		ordensServico.contains(cpf);
		 return ordensServico;
	}
	
	public double calculaFaturamentoTotal() {
		this.
		return ;
	}
	
	public String toString() {
		return "";
	}


	/* Getters e Setters */
	public List<OrdemServico> getOrdensServico() {
		return ordensServico;
	}


	public void setOrdensServico(List<OrdemServico> ordensServico) {
		this.ordensServico = ordensServico;
	}
	
	
}
