package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperatorBinary {

	public static void main(String[] args) {
		BinaryOperator<Double> media = 
				//pode tirar esse Double.
				(Double n1, Double n2) -> (n1 + n2)/2;
				
		System.out.println(media.apply(9.8, 8.7));
		
		BiFunction<Double, Double, String> resultado =
		(n1, n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado" : "Rerpvado";
		System.out.println(resultado.apply(9.7, 8.4));
		
		// pode ser feito usando  Binary e Function
		
		Function<Double, String> conceito =
		m -> m >=7 ? "Aprovado": "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(4.5, 4.3));
	}

}
