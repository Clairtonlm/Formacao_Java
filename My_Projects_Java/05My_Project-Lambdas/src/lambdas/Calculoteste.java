package lambdas;

public class Calculoteste {

	public static void main(String[] args) {
		Calculo soma = (x, y) ->{
			return x + y;
		};
		
		System.out.println(soma.executar(2, 3));
		
		soma = (x, y) -> x* y;
		System.out.println(soma.executar(5, 6));
		
		System.out.println(soma.legal());
		System.out.println(Calculo.massa());
	}

}
