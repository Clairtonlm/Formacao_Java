package modulo.estruturarepetitivas;

import java.util.Scanner;

public class CondicaoRegressiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n = sc.nextInt();
		for(int i = n; i >=0; i--) {
			System.out.println("O valor de i : " + i);
		}
	}

}
