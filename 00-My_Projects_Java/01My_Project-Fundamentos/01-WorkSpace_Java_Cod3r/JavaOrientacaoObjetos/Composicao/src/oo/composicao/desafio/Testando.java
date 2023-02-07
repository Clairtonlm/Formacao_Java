package oo.composicao.desafio;

public class Testando {

	

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		
		compra1.adcionarItem("Caneta", 100, 100);
		compra1.adcionarItem("Notebook", 3600.80, 2);
		
		Compra compra2 = new Compra();
		
		compra2.adcionarItem("Caderno", 10, 10);
		compra2.adcionarItem("Impressora", 700.80, 1);
		
		Cliente cliente = new Cliente("Seu Chico da Silva Moraes");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
