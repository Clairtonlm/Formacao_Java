package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class AmazenarProduto {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantos produtos você quer tirar a média?");
			int n = sc.nextInt();//dei um nextInt tenho que consumir a quebra de linha 
			Produto[] vect = new Produto[n];
			
			System.out.println("Digite o nome e valor do produto");
			for(int i = 0; i < vect.length; i++) {
				sc.nextLine();//consumindo a quebra de linha
				String name = sc.nextLine();
				double price = sc.nextDouble();
				vect[i] = new Produto(name, price);
			}
			double sum = 0.0;
			for( int i = 0; i < vect.length; i++) {
				sum += vect[i].getPrice();
			}
			double media = sum /vect.length;
			System.out.printf("A média dos preços = %.2f%n", media);
			sc.close();
	}//main

}//classe
