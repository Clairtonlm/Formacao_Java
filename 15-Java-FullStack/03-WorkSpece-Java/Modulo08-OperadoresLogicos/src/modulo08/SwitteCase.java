package modulo08;

public class SwitteCase {

	public static void main(String[] args) {
		int nota1 = 9;
		int nota2 = 8;
		int nota3 = 7;
		int nota4 = 1;
		int somaNota = (nota1 + nota2 + nota3 + nota4);
		double media = (somaNota )/4.0;
		System.out.println("Amédia do Aluno é "+ media);
		
		int mediaInt = (int) Math.round(media);
		//Switte Case - Usado para operações exatas para testar numeros, strings, boolean
		switch(mediaInt) {
		case 6:System.out.println("Recuoeração");
		break;
		case 7: 
			System.out.println("Aprovado");
			break;
		case 8: System.out.println("Aprovado");
		break;
		}

	}

}
