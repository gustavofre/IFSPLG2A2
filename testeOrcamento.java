package orcamentoFinanceiroPessoal;

import java.time.LocalDateTime;

public class testeOrcamento {
	
	public static void main (String  [] args) {
		
		debitoCredito debito1 = debitoCredito.DEBITO;
		debitoCredito credito1 = debitoCredito.CREDITO;
		debitoCredito total1 = debitoCredito.TOTAL;
		
		LocalDateTime agora1 = LocalDateTime.now();
		
		Moeda salario1= new Moeda ("5000.00");
		String salarioComentario = "Recebimento do Salário do mês de janeiro";
		
		Moeda aluguel1 = new Moeda ("1000.00");
		salario1.substrairCom("1000.00");
	
		
		Orcamento salario = new Orcamento(debito1.getDebitoCredito(), salario1.getValor(), agora1, salarioComentario);
		System.out.println(salario);
		
		
	}

}
