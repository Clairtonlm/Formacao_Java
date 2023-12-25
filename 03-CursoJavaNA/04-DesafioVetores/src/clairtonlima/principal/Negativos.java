package clairtonlima.principal;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas números serão digitados?");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		 for(int i =0; i<n; i++) {
			 System.out.print("Digite um número:");
			vet[i] = sc.nextInt();
		 }
		 
		 System.out.println("NÚMEROS NEGATIVOS:");
		 for(int i = 0; i < n; i++) {
			 if(vet[i] < 1) {
				 System.out.println(vet[i]);
			 }
		 }
		 
		 
		 sc.close();
	}

}
