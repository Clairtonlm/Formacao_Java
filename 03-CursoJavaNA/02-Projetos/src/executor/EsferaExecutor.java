package executor;

import java.util.Scanner;

public class EsferaExecutor {

	public static final double PI = 3.14;
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do Raio");
		double radius = sc.nextDouble();
		
		//usando metodos que tambem sao staticos na main
		double c = circunferencia(radius);
		double v = volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

	public static double circunferencia(double radius) {
		return 2.0  * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0  * PI * radius * radius * radius /3.0;
	}
	
}
