package modulo.estruturarepetitivas;

import java.util.Scanner;

public class RepeticaoWhile {
/*
 * fazer um programa que le numeros inteiros ate que um zero seja lido. Ao final mostrar a soma dos numeros lidos
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número");
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {//enquando x for diferente de zeo
			soma = soma + x;//va somando aqui
			System.out.println("Digite o número");
			x = sc.nextInt();
		}
		System.out.println(soma);
		
		sc.close();
	}

}


