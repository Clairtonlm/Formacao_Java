package executor;

import java.util.Scanner;

import app.Produto;

public class StartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Vamos cadastar novo produto");
		System.out.println("Nome do Produto");
		produto.nome = sc.nextLine();
		System.out.println("Preço do Produto");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade do Produto");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto.nome +  "," + produto.preco + ", " + produto.quantidade);

		
		
		sc.close();
	}

}
