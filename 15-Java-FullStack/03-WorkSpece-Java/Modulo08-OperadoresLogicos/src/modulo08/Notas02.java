package modulo08;

public class Notas02 {

	public static void main(String[] args) {
		int nota1 = 0;
		int nota2 = 8;
		int nota3 = 7;
		int nota4 = 9;
		int resultado = (nota1 + nota2 + nota3 + nota4);
		double media = (resultado )/4.0;
		
		System.out.println("Média "+ media);
		//operadores ternários são para micro-validações em uma linha só
		String saidaResultado;
		saidaResultado = media >=7 ? "Aluno aprovado com média: " : "Aluno reprovado: ";
		System.out.println(saidaResultado + media + " pontos");
		
		
		
		
		
		
		
		
		
		
	}

}
