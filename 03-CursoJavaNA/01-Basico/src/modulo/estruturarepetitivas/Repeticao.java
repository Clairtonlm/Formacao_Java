package modulo.estruturarepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a largura");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento");
		double comprimento = sc.nextDouble();
		
		double metrosQuadrados = largura * comprimento;
		System.out.println("O tereno tem " + metrosQuadrados + " metros quadrados");
		double area = largura * comprimento;
		double preco = area * metrosQuadrados;

		System.out.printf( "AREA = %2f%n", area);
		System.out.printf( "Preco = %2f%n", preco);
		

	}

}
