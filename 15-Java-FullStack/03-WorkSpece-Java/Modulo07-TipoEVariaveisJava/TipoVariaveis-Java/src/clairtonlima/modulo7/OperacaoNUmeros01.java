package clairtonlima.modulo7;

import java.util.Scanner;

public class OperacaoNUmeros01 {

	public static void main(String[] args) {
		System.out.println("Calculando notas");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota 1");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a nota 3");
		double nota3 = sc.nextDouble();
		System.out.println("Digite a nota 4");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		if(media <= 5.9) {
			System.out.println(" Aluno está de recubeparação");
		}else if(media >= 6) {
			System.out.println(" Aluno Aprovado");
		}else {
			System.out.println("Resultado invalido");
		}
		System.out.println("Média das notas: " + media);
	}

}
