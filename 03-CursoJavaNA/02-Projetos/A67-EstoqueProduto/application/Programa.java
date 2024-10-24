package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Digite o nome do estoque do produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.println("Digite o quantidade de produtos: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.nome + " ," + produto.quantidade + " ," + produto.preco);








        sc.close();
    }
}
