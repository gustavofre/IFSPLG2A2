package Lista3;

import java.util.List;

public class OrdemServico {

	/* Atributos */
	private int codigo;
	private Cliente cliente;
	private List<Servico> servicos;
	private List<Mecanico> mecanicos;
	
	/* Construtores */
	public OrdemServico (int codigo, Cliente cliente) {
		this.codigo = codigo;
		this.cliente = cliente;
	}
	
	/* Métodos */
	public void adicionaServico(Servico servico) {
		
	}
	
	public void adicionaMecanico(Mecanico mecanico)	{
		
	}
	
	public double calculaValorTotal (){
		return 0;
	}
	
	public boolean possuiServico (int codigo){
		return true;
	}
	
	public boolean possuiMecanico (String cpf) {
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	/* Getters e Setters */
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public List<Mecanico> getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(List<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}
	
	
}
