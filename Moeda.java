package orcamentoFinanceiroPessoal;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Moeda {
	
	private BigDecimal valor ;
	private static final String UNIDADE_MONETARIA = "R$";
	private static int CASAS_DECIMAIS = 2;
	private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADE_MONETARIA + " #,###,##0.00");
	
	public Moeda (String valor) {
		this.valor = new BigDecimal(valor);
	}
	
	public BigDecimal getValor () {
		return valor;
	}
	
	public String getValorFormatado() {
		return FORMATO.format(valor);
	}
	
	public void somarCom (String valorSomar) {
		this.valor = this.valor.add(new BigDecimal(valorSomar));
	}

	public void substrairCom (String valorSubtrair) {
		this.valor = this.valor.subtract(new BigDecimal(valorSubtrair));
	}
	
	public void multiplicaCom (String valorMultiplicar) {
		this.valor = this.valor.multiply(new BigDecimal(valorMultiplicar));
	}
}
