package clairtonlima.principal;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(int i=0; i<n;i++) {
			System.out.println(" Dados da " + ( i+1)+ "ª pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		//para pegar todas as alturas digitadas
		double soma = 0.0;
		for(int i=0; i < n; i++) {
			soma = soma + alturas[i];
		}
		//para fazer a media das alturas
		double mediaAlturas = soma / n;
		System.out.println();
		System.out.printf("Altura média das pessoas é: %.2f%n", mediaAlturas);
		
		//saber quantas pessoas sao menores de 16 anos
		int conte = 0;
		for(int i=0; i <n; i++) {
			if(idades[i] < 16) {
				conte = conte + 1;
			}
		}
		double percentualPessoasMenosQue16 = conte * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualPessoasMenosQue16);
		
		//imprimir os nomes das pessoas que tem < 16 anos
		for(int i=0; i<n; i++) {
			if(idades[1] < 16) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();
	}//fim main

}//fim class
