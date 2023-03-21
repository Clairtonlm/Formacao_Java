package loja;

import java.math.BigDecimal;

public class ExcecutarTeste {

	public static void main(String[] args) {
		//Instanciando Produtos
		Produto produto1 = new Produto();
		produto1.setId(001L);
		produto1.setNome("Orientação Objetos");
		produto1.setValor(100.0);
		
		Produto produto2 = new Produto();
		produto1.setId(002L);
		produto1.setNome("Curso Java");
		produto1.setValor(200);
		
		Produto produto3 = new Produto();
		produto1.setId(003L);
		produto1.setNome("Curso Desenvolvimento Web");
		produto1.setValor(300);
		
		Produto produto4 = new Produto();
		produto1.setId(004L);
		produto1.setNome("Curso JavaScript");
		produto1.setValor(100);
				
		//Instancia de Venda
		System.out.println("-----Instancia de Venda----");
		Venda venda = new Venda();
		venda.setDescricao("Curso Java");
		venda.setEnderecoEntrega("Rua das Flores 405");
		venda.setId(10L);
		venda.setNomeClente("Zord");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		//colocando produnto dentro da lista diretamente
		venda.getListaProduto().add(produto1);//assim nao da para fazer validações
		venda.getListaProduto().add(produto2);
		venda.getListaProduto().add(produto3);
		
		//usando metodo--> dá para fazer validações
		venda.addProduto(produto4);
		
		//Fazer Interação com a Lista
		System.out.println("Descrição da Venda: " 
		+ venda.getDescricao() + " e o total : " + venda.totalVenda());
		
		System.out.println( venda);
		
	
	}//fim do main

}//fim da class
