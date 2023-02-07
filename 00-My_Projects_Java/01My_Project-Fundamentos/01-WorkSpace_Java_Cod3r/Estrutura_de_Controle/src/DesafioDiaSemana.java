package estruturadecontrole;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// domingo -> 1
		//quarta -> 4
		//terca->3
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual um dia da semana?");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")){
			System.out.println("1");
		}else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}else {
			System.out.println("dia invalido");
		}
		
		System.out.println("\n Fim do Programa!");
		entrada.close();
	}

}
