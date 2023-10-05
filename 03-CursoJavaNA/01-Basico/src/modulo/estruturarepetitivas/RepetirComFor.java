package modulo.estruturarepetitivas;

import java.util.Scanner;

public class RepetirComFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int N = sc.nextInt();//determina o numero de vezes do for
		int soma = 0;
		for(int i = 0; i < N;i++) {
			System.out.println("Digite um numero");
			int x = sc.nextInt();//acumula os numeros digitados
			soma += x;//faz a soma
		}
		
		
		System.out.println(soma);
		
		sc.close();
	}

}
