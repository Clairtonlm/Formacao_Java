package executor;

import java.util.Scanner;


import app.Calculador2;

public class EsferaExecutor3 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do Raio");
		double radius = sc.nextDouble();
		
		//para usar metodos que sao staticos basta usar o nome da classe nos metodos. 
		//Indepedente de obejto.
		
		double c = Calculador2.circunferencia(radius);
		double v = Calculador2.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculador2.PI);
		
			
		
		
		sc.close();
	}

	
	
}
