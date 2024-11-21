package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas alturas quer calcular? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite altura " + (i + 1));
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
       for (int i = 0; i < n; i++) {
           soma += vect[i];
       }
       double media = soma / n;

        System.out.printf("Média das alturas: %.2f%n ",  media);
        sc.close();
    }
}