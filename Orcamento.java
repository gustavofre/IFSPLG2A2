package orcamentoFinanceiroPessoal;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orcamento {
	
	private BigDecimal valor; 
	private debitoCredito tipo;
	private LocalDateTime horario;
	private String comentario;
	
	
	
	public void Orcamento (debitoCredito tipo, BigDecimal valor, LocalDateTime horario, String comentario ) {
		this.tipo = tipo;
		this.valor = valor; 
		this.horario = horario;
		this.comentario = comentario;
	}
	
	@Override
	public String toString() {
		return tipo + " " +  valor + " " + horario + " " + comentario;
	}

}
