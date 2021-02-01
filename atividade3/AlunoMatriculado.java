package atividade3;

public class AlunoMatriculado {

	private int matricula;
	private String nome; 
	private double prova1 = 0;
	private double prova2 = 0;
	private double trabalho = 0;
	private double mediaAlunoMatriculado = 0;
	private String mensagemSituacao = "";
	
	public double calculoMedia () {
		double mediaAlunoMatriculado1 = (prova1 + prova2 + trabalho)/3;
		return this.mediaAlunoMatriculado = mediaAlunoMatriculado1;
	}
	
	public String Aprovacao(String mensagemSituacao ) {
		if (mediaAlunoMatriculado >= 6) {
			mensagemSituacao = "APROVADO!!";
			this.mensagemSituacao = mensagemSituacao;
			return this.mensagemSituacao;
		}else if(mediaAlunoMatriculado < 6 && mediaAlunoMatriculado >=4) {
			mensagemSituacao = " para IFA!!";
			this.mensagemSituacao = mensagemSituacao;
			return this.mensagemSituacao;
		} else if (mediaAlunoMatriculado < 4){
			mensagemSituacao = "REPROVADO!!";
			this.mensagemSituacao = mensagemSituacao;
			return this.mensagemSituacao;
		}
		return this.mensagemSituacao;
	}

	
	
	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getProva1() {
		return prova1;
	}


	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}


	public double getProva2() {
		return prova2;
	}


	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}


	public double getTrabalho() {
		return trabalho;
	}


	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	
	public void imprimirSituacao () {
		
		System.out.println("O aluno " + getNome() + " de matricula " + getMatricula() + " teve média de  " +  mediaAlunoMatriculado
			 + 	" e foi " + Aprovacao(mensagemSituacao));
		
	}
	
	
	
}
