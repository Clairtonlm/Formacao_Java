package modulo08;

public class Notas02 {

	public static void main(String[] args) {
		int nota1 = 9;
		int nota2 = 8;
		int nota3 = 7;
		int nota4 = 1;
		int resultado = (nota1 + nota2 + nota3 + nota4);
		double media = (resultado )/4.0;
		System.out.println("Amédia do Aluno é "+ media);
		//Operações aninhadas - são operações dentro de operações
		
		if(media >= 5) {
			if(media >= 7) {
				System.out.println("Aprovado direto");
			}else {
				System.out.println("Aluno em recuperação");
			}
		}else {
			System.out.println("Reprovado direto");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
