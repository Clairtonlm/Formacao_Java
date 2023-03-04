package stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
										//nome, preco, desconto, frete;
				Produto p1 = new Produto("Lapis",1.99, 0.12, 30);
				Produto p2 = new Produto("Notebook",2999.30, 0.32, 50.00);
				Produto p3 = new Produto("Impressora",800.00, 0.15, 100.00);
				Produto p4 = new Produto("Monitor",600.00, 0.10, 20.00);
				Produto p5 = new Produto("Projetor",6700.00, 0.40, 120.00);
				Produto p6 = new Produto("Maouse", 60.00, 0.10, 00);
				Produto p7 = new Produto("teclaco", 25.00, 0.10, 00);
				
				List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
				
				//Filter, filter, map
				
				Predicate<Produto> grandeDesconto = p ->p.desconto >= 0.2;
				Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
				Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
				
				Function<Produto, String> chamadaPromocional =
						p -> "Aproveite!!!" + p.nome + " por R$ " + p.preco;
				
				produtos.stream()
					.filter(grandeDesconto)
					.filter(freteGratis)
					.filter(produtoRelevante)
					.map(chamadaPromocional)
					.forEach(System.out::println);
	}

}
