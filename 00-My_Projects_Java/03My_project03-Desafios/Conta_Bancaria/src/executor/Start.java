package executor;

import java.util.Scanner;

import contabancaria.Conta;

public class Start {

	public static void main(String[] args) {
		
		Conta myConta = new Conta("MyName", 0);
		
		myConta.setName("Clairton");
		System.out.println(myConta.getSaldo());
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Didite seu nome");
		String name = input.next();
		System.out.println("Entre com seu deposito");
		myConta.depositar(100);
		
		System.out.println(myConta.getSaldo());
		
		
		
		
		
		//System.out.println(myConta.getName());
		//System.out.println("Se saldo é:" + myConta.getSaldo());
		
		
		
		
		
		input.close();
	}//fim da classe main

}//fim do programa
