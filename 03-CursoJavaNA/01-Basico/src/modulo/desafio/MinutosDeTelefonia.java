package modulo.desafio;

import java.util.Locale;
import java.util.Scanner;

public class MinutosDeTelefonia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de minutos usados no plano");
		int minutos = sc.nextInt();
		
		double conta = 50;
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf(" Valor da conta = R$ %2f%n", conta);
		
		
		sc.close();
	}

}
