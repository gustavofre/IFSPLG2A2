package atividade5;

import java.util.Calendar;

public class Data {
	
	private int mes = 0;
	private int dia = 0;
	private int ano = 0;
	private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	
	public Data (int dia, int meses, int ano) {
		this.dia = dia;
		this.mes = meses;
		this.ano = ano;
	}
	
	public void validadeMes (int meses) {
		if (meses >=1 && meses <=12) {
			this.mes = meses;
		} else {
			 this.mes = 0;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int meses) {
		this.mes = meses;
	}
	
	

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
