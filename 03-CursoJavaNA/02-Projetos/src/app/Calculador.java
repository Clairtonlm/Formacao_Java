package app;

public class Calculador {
	//sao metodos normais para chamar eles na Main vai precisar instanciar o objeto Calculador
	public  final double PI = 3.14;
	
	public  double circunferencia(double radius) {
		return 2.0  * PI * radius;
	}
	
	public  double volume(double radius) {
		return 4.0  * PI * radius * radius * radius /3.0;
	}
}
