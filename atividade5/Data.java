package atividade5;

import java.util.Calendar;

public class Data {
	
	private int mes;
	private int dia;
	private int ano;
	private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	
	public Data (int dia, int meses, int ano) {
		this.setAno(ano);
		this.setMes(meses);
		this.setDia(dia);	
	}
	
	public Data () {
		System.out.println(this.currentYear);
	}
	
	public boolean setMes (int meses) {
		if (meses >=1 && meses <=12) {
			this.mes = meses;
			return true;
		} 
		return false;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public boolean setDia(int dia) {
		if (dia < 1) {
			return false;
		}
		else if (this.mes == 2 && dia <= 28){
			this.dia = dia;
			return true;
		} else if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 ||
				this.mes == 10 || this.mes == 12 && dia <= 31)  {
			this.dia = dia;
			return true  ;
		} else if ( this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 10 && dia <=30) {
			 this.dia = dia;
			return true; 
		} else if (this.ano % 4 == 0 && this.mes == 2 && dia <= 29) {
			this.dia = dia;
			return true;
		}
		else {
			return false;
		}
	}

	public int getAno() {
		return ano;
	}

	public boolean setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
			return true;
		}else {
			return false;
		}
	}
	

}
