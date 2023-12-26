package clairtonlima.principal;

import java.util.Scanner;

public class Soma_Vetores2 {

	public static void main(String[] args) {
	 
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite a quantidade de elementos dos vetores A e B: ");
		        int n = sc.nextInt();

		        int[] vetorA = new int[n];
		        int[] vetorB = new int[n];
		        int[] vetorC = new int[n];

		        System.out.println("Digite os elementos do vetor A:");
		        for (int i = 0; i < n; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            vetorA[i] = sc.nextInt();
		        }

		        System.out.println("Digite os elementos do vetor B:");
		        for (int i = 0; i < n; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            vetorB[i] = sc.nextInt();
		        }

		        // Somando os elementos dos vetores A e B para formar o vetor C
		        for (int i = 0; i < n; i++) {
		            vetorC[i] = vetorA[i] + vetorB[i];
		        }

		        System.out.println("Vetor C (soma dos elementos de A e B):");
		        for (int i = 0; i < n; i++) {
		            System.out.print(vetorC[i] + " ");
		        }

		        sc.close();
		    }
		}


	


