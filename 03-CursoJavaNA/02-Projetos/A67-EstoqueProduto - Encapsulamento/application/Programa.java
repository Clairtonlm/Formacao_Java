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
        produto.setNome(sc.nextLine());
        System.out.println("Digite o preço do produto: ");
        produto.setPreco(sc.nextDouble());
        System.out.println("Digite o quantidade de produtos: ");


       // System.out.println(produto.nome + " ," + produto.quantidade + " ," + produto.preco);

        System.out.println(produto.toString());
        System.out.println("Entre a quantidade de produtos que vai adicionar: ");
        int quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println("Update do produto" + produto.toString());
        System.out.println(produto.toString());

        System.out.println("Digite quantos produtos devem ser removidos");
        int quantidade2 = sc.nextInt();
        produto.removeProdutos(quantidade2);
        System.out.println(produto.toString());





        sc.close();
    }
}
