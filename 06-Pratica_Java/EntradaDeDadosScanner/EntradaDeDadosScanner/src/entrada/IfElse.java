package entrada;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Digite sua idade");
		Scanner scan = new Scanner(System.in);
		int idade = scan.nextInt();
		
		if(idade >=18) {
			System.out.println("Você tem " + idade + " anos e  é maior de idade");
		}else {
			System.out.println("Você tem " + idade + " anos e nao é maior de idade");
		}
	}

}
