package loops;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Ente com uma nota");
			double nota = scan.nextDouble();
			
			if( nota >=0 && nota <=10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}else {
				System.out.println("Nota invalida");
			}
			
		}
		while(!notaValida);
	}//main
		
	

}
