package modulo.basico;

public class Casting {

	public static void main(String[] args) {
		double a,b,c, area;
		a= 6.0;
		b= 8.0;
		c= 5.0;
		
		area = (a + b)/2.0 * c;
		
		System.out.println(area);
		
		//CASTING--> conversão explicita dos valores
		int d, e;
		double resultado;
		d = 5;
		e = 2;
		 
		//casting
		resultado = (double)d / e;
		System.out.println(resultado);
			
	}

}
