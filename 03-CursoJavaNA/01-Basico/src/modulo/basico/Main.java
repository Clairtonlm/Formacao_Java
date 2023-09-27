package modulo.basico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		System.out.println("Digite um numero inteiro");
		x = sc.nextInt();//quebra de linha pendente
		sc.nextLine();//solução da linha pendente
		System.out.println("Digite algo");
		s1= sc.nextLine();
		System.out.println("Digite algo");
		s2= sc.nextLine();
		System.out.println("Digite algo");
		s3= sc.nextLine();
		
		System.out.println("Dados digitados foram");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
