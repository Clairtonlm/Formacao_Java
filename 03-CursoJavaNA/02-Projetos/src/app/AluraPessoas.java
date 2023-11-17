package app;

import java.util.Locale;
import java.util.Scanner;

public class AluraPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você que ver a média das alturas");
		int n  = sc.nextInt();
		double[] vect = new double[n];
		System.out.println("Digite os valores das alturas Ex.: 1.70");
		for(int i= 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		double media = sum / n;
		System.out.printf("A altura media é: %.2f%n", media);
		
		sc.close();
	}

}
