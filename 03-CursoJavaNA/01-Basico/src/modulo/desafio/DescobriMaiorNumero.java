package modulo.desafio;

import java.util.Scanner;

public class DescobriMaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite três números");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//tenho que chamar as funções
		int maior = max(a, b, c);
		showResult(maior);
	}//main
	
	public static int max( int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if( y > x && y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("O maior número é :" + value );
	}

}//class
