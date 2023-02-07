package estruturadecontrole;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0){
			System.out.println("Nota Inválida");
		}else if(nota >= 8.1) {
			System.out.println("Conceito A");
		}else if(nota <= 5) {
			System.out.println("Conceito B");
			
			
			
		}
			
			
		System.out.println("\n Fim do Programa!");
		entrada.close();
	}

}
