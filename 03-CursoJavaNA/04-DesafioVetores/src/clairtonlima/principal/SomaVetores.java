package clairtonlima.principal;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números vai ter no vetor A?");
		int a = sc.nextInt();
		System.out.print("Quantos numeros vai ter no vetor B?");
		int b = sc.nextInt();
		
		System.out.println("--------Criando vertor A");
		int[] vetorA = new int[a];
		for(int i = 0; i < a;i++) {
			System.out.print("Digite um número");
			vetorA[i] = sc.nextInt();
		}
		System.out.println("--------Criando vertor B");
		int[] vetorB = new int[b];
		for(int i = 0; i < a;i++) {
			System.out.print("Digite um número");
			vetorB[i] = sc.nextInt();
		}
		
		// Verifica o tamanho do vetor resultante C
        int tamanhoC = Math.max(a, b);
		
        int[] vetorC = new int[tamanhoC];
        
     // Soma os elementos correspondentes de A e B para formar o vetor C
        for (int i = 0; i < tamanhoC; i++) {
            if (i < a && i < b) {
                vetorC[i] = vetorA[i] + vetorB[i];
            } else if (i < a) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }
		
        System.out.println("Vetor C (soma dos elementos de A e B):");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.print(vetorC[i] + " ");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
