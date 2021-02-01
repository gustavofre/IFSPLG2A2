package atividade3;

public class AlunoMatriculadoTeste {
	
	public static void main (String [] args) {
		
		AlunoMatriculado aluno1 = new AlunoMatriculado ();
		
		aluno1.setNome("Gustavo Freitas");
		aluno1.setMatricula(209090);
		aluno1.setProva1(1);
		aluno1.setProva2(10);
		aluno1.setTrabalho(7);
		
		aluno1.calculoMedia();
		aluno1.imprimirSituacao();
		
	}
	
	

}
