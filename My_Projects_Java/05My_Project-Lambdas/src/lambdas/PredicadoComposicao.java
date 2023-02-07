package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		
		Predicate<Integer> isTresDigitos = 
				num -> num >=100 && num <=999;
				
				System.out.println(" O numero é : " + isPar.test(35));
				System.out.println("O numero é :" + isTresDigitos.test(563));
	//Fazendo a composição var.and(var2).negate().test(valor)
				
				//nesse caso 22 é par, mas nao é de tres digitos. entao false
				System.out.println(isPar.and(isTresDigitos).test(22));
				
				//nesse caso eu nego o resultado
				System.out.println(isPar.and(isTresDigitos).negate().test(22));
				
				// é par ou tem tres digitos
				System.out.println(isPar.or(isTresDigitos).test(22));
		
		
	}

}
