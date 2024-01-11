package clairtonlima.modulo7;

import java.util.Scanner;

public class TipoString {

	public static void main(String[] args) {
		System.out.println(" String é texto");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Olá, " + nome + " seja bem vindo ao Curso de Java");
	}

}
