package modulo.basico;

import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String[] args) {
		// estrutura de controle dependendo de uma condição
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = scn.nextInt();
	
		if(idade >= 18 && idade <= 22) {
			System.out.println(" Voce é maior de idade e estar estar entre 18 e 22");
		}else {
			System.out.println(" Nao é maior de idade e estar fora de 18 e 22");
		}
		
		
		
		
		
		scn.close();
	}

}
