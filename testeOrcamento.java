package orcamentoFinanceiroPessoal;

import java.time.LocalDateTime;

public class testeOrcamento {
	
	public static void main (String  [] args) {
		
		debitoCredito debito1 = debitoCredito.DEBITO;
		debitoCredito credito1 = debitoCredito.CREDITO;
		debitoCredito total1 = debitoCredito.TOTAL;
		
		LocalDateTime agora1 = LocalDateTime.now();
		
		String mensagemTotal = "Seu saldo total";
		
		Moeda salario1= new Moeda ("5000.00");
		String salarioComentario = "Recebimento do Salário do mês de janeiro";
		Orcamento salario = new Orcamento(debito1, salario1.getValorFormatado(), agora1, salarioComentario);
		System.out.println(salario);
		
		Moeda aluguel1 = new Moeda ("1000.00");
		salario1.substrairCom("1000.00");
		String pagamentoAluguel = "Pagamento do Aluguel";
		Orcamento saldoAluguel = new Orcamento(credito1, aluguel1.getValorFormatado(), agora1, pagamentoAluguel);
		System.out.println(saldoAluguel);
		
		
		Orcamento total = new Orcamento (total1, salario1.getValorFormatado(), agora1, mensagemTotal );
		System.out.println(total);
		
		System.out.println();
		
		Moeda contaLuz = new Moeda ("300.00");
		salario1.substrairCom("300");
		String pagamentoContaLuz = "Pagamento conta de Luz";
		Orcamento saldoContaLuz = new Orcamento (credito1, contaLuz.getValorFormatado(), agora1, pagamentoContaLuz);
		System.out.println(saldoContaLuz);
		Orcamento total2 = new Orcamento (total1, salario1.getValorFormatado(), agora1, mensagemTotal );
		System.out.println(total2 + "\n");
		
		Moeda jurosInvestimentos1 = new Moeda ("1500.00");
		salario1.somarCom("1500.00");
		String recebimentoInvestimentos = "Recebimento Investimentos";
		Orcamento saldoRecebimentoInvestimentos = new Orcamento (debito1, jurosInvestimentos1.getValorFormatado(), agora1, recebimentoInvestimentos);
		System.out.println(saldoRecebimentoInvestimentos);
		Orcamento total3 = new Orcamento (total1, salario1.getValorFormatado(), agora1, mensagemTotal);
		System.out.println(total3);
		
	}

}
