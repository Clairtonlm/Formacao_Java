package clairtonlima.principal;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números vai digitar?");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		for(int i = 0; i < n;i++) {
			System.out.print("Digite um número");
			vetor[i] = sc.nextInt();
		}
		System.out.println("Você já digitou " + n + " números e são pares:");
		
		int pares = 0;
		for(int i = 0; i < n;i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf(" %d ", vetor[i]);
				pares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", pares);
		sc.close();
	}//main

}
