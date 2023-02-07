package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		
		
		BinaryOperator<Double> calc = (x, y)->{
			return x + y;
		};

		System.out.println(calc.apply(10.0, 20.0));
		
		
		BinaryOperator<Integer> calc2 = (x, y)->{
			return x * y;
		};

		System.out.println(calc2.apply(5 , 8));
		
		
		
		
	}
	
}
