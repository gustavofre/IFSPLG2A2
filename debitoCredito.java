package orcamentoFinanceiroPessoal;

public enum debitoCredito {
	
	DEBITO('+'), CREDITO('-'), TOTAL ('=');
	
	private String valor; 
	private int salario;
	
	debitoCredito( String valor){
		this.valor = valor;
	}
	
	String getDebitoCredito () {
		 return this.valor;
	}
	
	 debitoCredito(int valorSalario ) {
		 this.setSalario(valorSalario);
	}
	 
	 debitoCredito () {
		 return;
	 }

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	 

	
	
}
