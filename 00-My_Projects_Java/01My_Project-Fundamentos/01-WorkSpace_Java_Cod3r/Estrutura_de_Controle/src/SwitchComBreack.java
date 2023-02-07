import java.util.Scanner;

public class SwitchComBreack {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.println("Informe a nota do Aluno");
		int nota = entrada.nextInt();
		
		switch(nota){
		case 10 :
		case 9:
			conceito = "Apovado";
		break;
		
		case 8:
		case 7:
			conceito = "Passou mas poderia ser melhor";
			break;
		default:
			conceito = "Não encontrado";
		break;
				
		}
		System.out.println("Conceito é " + conceito);
		entrada.close();
	}

}
