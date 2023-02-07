package praticando;

public class CalcularTemperatura {

	public static void main(String[] args) {
		
		 double FATOR = 5.0 /9.0;
		 double AJUSTE = 32;
		double Farenhait = 86;
		double Celsius = (Farenhait - AJUSTE)*FATOR;
		
		System.out.println("O resultado é " + Celsius + " c°");

	}

}
