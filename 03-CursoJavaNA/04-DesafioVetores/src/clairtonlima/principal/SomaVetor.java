package clairtonlima.principal;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qauntos números vai digitar?");
		int N = sc.nextInt();
		
		int[] vet = new int[N];
		for(int i = 0; i < N; i++) {
			System.out.println("Digite um número");
			vet[i] = sc.nextInt();
			
		}
		
	
	System.out.println("Valores digitados:");
	for(int i = 0; i < N; i++) {
		System.out.println(vet[i]);
	}
	
	double soma = 0.0;
	for(int i =0; i< N; i++) {
		soma = soma + vet[i];
	}
	System.out.println("A soma é: " + soma);
	double media = soma / N;
	System.out.println("Média: " + media);
		
		sc.close();
	}

}
