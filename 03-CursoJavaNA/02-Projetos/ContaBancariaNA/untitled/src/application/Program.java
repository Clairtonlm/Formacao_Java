package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println(" Entre com o número da conta ");
		int numero = sc.nextInt();//tem uma pendecia de linha
		System.out.println("Qual o nome do titular? ");
		sc.nextLine();//tira a pendencia de linha
		String titular = sc.nextLine();
		
		System.out.println(" Tem deposito inicial (y/n)");
		char resposta = sc.next().charAt(0);
		if(resposta == 'y') {
			System.out.println("Entre com valor do deposito");
			double inicialDeposito = sc.nextDouble();
			conta = new Conta (numero,titular,inicialDeposito);
		}
		else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println(" Conta");
		System.out.println(conta);
		
		System.out.println();
		System.out.print(" Entre com o valor do deposito");
		double depositoValor = sc.nextDouble();
		conta.deposito(depositoValor);
		
		System.out.println(" Conta atualizada");
		System.out.println(conta);
		
		System.out.println();
		System.out.print(" Entre com o valor do saque");
		double saqueValor = sc.nextDouble();
		conta.saque(saqueValor);
		System.out.println(" Conta atualizada");
		System.out.println(conta);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}//main

}//class
