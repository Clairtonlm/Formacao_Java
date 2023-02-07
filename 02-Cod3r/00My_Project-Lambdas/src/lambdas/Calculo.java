package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "mesmo que o @FUNCITIONALINTERFACE  aceite so um metodo \n podemos usa default  static ";
				
	}
	
	static String massa() {
		return "Muito massa";
	}
	
	
	
	
	
	
}
