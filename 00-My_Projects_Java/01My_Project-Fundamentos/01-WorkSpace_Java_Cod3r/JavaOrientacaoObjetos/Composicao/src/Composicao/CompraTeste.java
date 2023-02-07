package Composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Caderno", 2, 12.20));
		compra1.itens.add(new Item("Borracha", 10, 3.10));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
	}

}
