package condicao;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com a operação (+ - / *)");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valido = true;//fleg
		
		switch(operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default: System.out.println("Operação inválida. Inicie novamente"); 
		valido = false;break;
		}
		if(valido) {
			System.out.println("Resultado: " + resultado);
			if(resultado >=0) {
				System.out.println("Resultado positivo");
			}else {
				System.out.println("Resultado negativo");
			}
			if(resultado % 2 ==0) {
				System.out.println("Resultado é um número par");
			}else {
				System.out.println("Resultado é um número impar");
			}
		}
		
	
	}
}
