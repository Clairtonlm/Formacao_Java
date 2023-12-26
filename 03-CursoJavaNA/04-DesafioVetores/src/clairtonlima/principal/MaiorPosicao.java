package clairtonlima.principal;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números vai digitar?");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		for(int i = 0; i < n;i++) {
			System.out.print("Digite um número");
			vetor[i] = sc.nextInt();
		}
		
		double maior = vetor[0];
		int posMaior = 0;
		for(int i =0; i <n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		
		 System.out.printf("MAIOR VALOR = %.1f\n", maior);
		 System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);
		
		
		
		
sc.close();
	}//main

}//class
