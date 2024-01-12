package modulo08;

public class ConcicoesIfElse {

	public static void main(String[] args) {

		
		int mediaAluno = 20;
		String nome = "Dev";
		
		if(mediaAluno >= 70 && nome.equals("Dev")) {
			System.out.println(" Aluno Aprovado");
		}else if(mediaAluno < 70) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aluno nao encontraddo");
		}

		

	}

}
