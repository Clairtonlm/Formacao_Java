package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	/*1-A parti do produto calcular o preço real ( com desconto)
	 * 2-Imposto Municipal: >= 2500 (8.5¨%)/ < 2500 (isento)
	 * 3- Frete: >= 3000 (100)/ < 3000 (50)
	 * 4- arrendocar: deixar duas casas decimais
	 * Formatar R$ 1234.56
	 * */

	public static void main(String[] args) {
		
		
		Function<Produto, Double> precoFinal=
				produto -> produto.preco * (1-produto.desconto);
				
		UnaryOperator<Double> impostoMunicipal=
		preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete=
				preco -> preco >= 3000 ? preco + 100: preco + 50;
				
		UnaryOperator<Double> arrendondar=
				preco -> Double.parseDouble(String.format("%.2f", preco));
				
		Function<Double, String> formatar=
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("IPad", 3235.89, 0.13) ;
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arrendondar)
				.andThen(formatar)
				.apply(p);
System.out.println(" O preço final é : " + preco);
	}

}
