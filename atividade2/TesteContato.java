package atividade2;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato1 = new Contato ("Gustavo Freitas", "11925874123", "Rua dos nada, 0");
		System.out.println(contato1.text());
		
		Contato contato2 = new Contato ("Maria Socorro Freitas", "11965874510", "Rua dos tudo, 100");
		System.out.println(contato2.text());
		
	}

}
