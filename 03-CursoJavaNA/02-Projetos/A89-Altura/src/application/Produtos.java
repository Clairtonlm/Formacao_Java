package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos: ");

        int n = sc.nextInt();

        Produto[] vect = new Produto[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double totalsoma = 0.0;
        for (int i = 0; i < n; i++) {
            totalsoma += vect[i].getPreco();
        }
        double media = totalsoma / n;
        System.out.printf("Media: %.2f%n", media);



        sc.close();
    }
}
