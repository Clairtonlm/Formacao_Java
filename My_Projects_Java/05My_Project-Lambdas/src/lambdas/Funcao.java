package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuimpar = 
				num -> num % 2 == 0 ? "Par" : "impar";
				
				
				Function<String, String> oResultadoE =
						valor -> "O resultado é " + valor;
				Function<String, String> empolgado =
				valor -> valor + "!!!!";
		
		String resultadoFinal = parOuimpar
				//e então
				.andThen(oResultadoE)
				.andThen( empolgado)
				.apply(34);
		
		System.out.println(resultadoFinal);
		System.out.println("O numero é : " + parOuimpar.apply(6));
		
	}

}
