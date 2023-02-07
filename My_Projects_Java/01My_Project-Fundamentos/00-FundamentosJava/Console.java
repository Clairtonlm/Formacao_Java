package praticando;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.print("dia!\n");//\n quebra de linha
		
		System.out.println("Bom ");
		System.err.println("dia");//mensage de erro em vermelho
		
		System.out.printf("Mesagem: %d %d %d %s %n ", 1, 2, 3,"Essa è a senha");//print formatado
		
		System.out.printf("Sálario: %.1f%n", 1234.5678);//%1.f%n-->uma casa decimal arendodada
		System.out.printf("Nome: %s%n", "Clairton Lima");
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf(" %s %s tem %d anos %n ", nome, sobrenome, idade);
		
		entrada.close();
	}
}


