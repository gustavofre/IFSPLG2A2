package Lista3;

public class TesteOficina {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Gustavo Freitas", "12345678901", "1132654789");
		Cliente cliente2 = new Cliente("Valentim Mario", "98765432101", "9987451402");
		Cliente cliente3 = new Cliente ("Maria Socorro", "587412036987", "77854712365");
		
		Mecanico mecanico1 = new Mecanico ("Flávio Augusto", "987452109635", "Troca de óleo");
		Mecanico mecanico2 = new Mecanico ("Roberto", "874521698725", "Motor");
		Mecanico mecanico3 = new Mecanico ("Dênis", "9875631058", "Geral");
		
		Oficina oficina1 = new Oficina();
		Oficina oficina2 = new Oficina();
		Oficina oficina3 = new Oficina();
	
		Servico servico1 = new Servico(1, "Reparo da roda", 150.50);
		Servico servico2 = new Servico(2, "Novo motor", 4678.10);
		Servico servico3 = new Servico(3, "Troca de óleo", 50.00);
		
		OrdemServico ordemServico1 = new OrdemServico(1, cliente1 );
		OrdemServico ordemServico2 = new OrdemServico(3, cliente2);
		OrdemServico ordemServico3 = new OrdemServico(5, cliente3);
		
		
	}

}
