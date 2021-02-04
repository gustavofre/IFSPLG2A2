package orcamentoFinanceiroPessoal;

public enum debitoCredito {
	
	DEBITO('+'), CREDITO('-'), TOTAL ('=');
	
	private char valor; 
	
	debitoCredito( char valor){
		this.valor = valor;
	}
	
	char getDebitoCredito () {
		 return this.valor;
	}
		 
}
