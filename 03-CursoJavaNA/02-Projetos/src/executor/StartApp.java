package executor;

import java.util.Scanner;



public class StartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Vamos cadastar novo produto");
		System.out.println("Nome do Produto");
		String nome = sc.nextLine();
		
		System.out.println("Preço do Produto");
		double preco = sc.nextDouble();
		
		System.out.println("Quantidade do Produto");
		int quantidade = sc.nextInt();
		
		Produto2 produto = new Produto2();
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.println("Entre com a quntidade para ser adcionado ao estoque");
		int qtd = sc.nextInt();
		produto.addProduto(qtd);
		
		System.out.println();
		System.out.println("Atualizando produtos em estoque " + produto);
		
		System.out.println();
		System.out.println("Entre com a quntidade para serem  removidos do estoque");
		int remove = sc.nextInt();
		produto.removerProduto(remove);
		
		System.out.println();
		System.out.println("Atualizando produtos em estoque " + produto);
		
		
		sc.close();
	}

}
