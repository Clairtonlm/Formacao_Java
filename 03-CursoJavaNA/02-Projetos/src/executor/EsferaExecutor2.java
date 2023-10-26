package executor;

import java.util.Scanner;

import app.Calculador;

public class EsferaExecutor2 {

	
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do Raio");
		double radius = sc.nextDouble();
		//instacia do objeto para usar os metodos
		Calculador calc = new Calculador();
		
		double c = calc.circunferencia(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

	
	
}
