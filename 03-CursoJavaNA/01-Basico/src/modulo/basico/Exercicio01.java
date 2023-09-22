package modulo.basico;

import java.util.Locale;

public class Exercicio01 {

	public static <String> void main(String[] args) {
		
		String product1 = (String) "Computer";
		String product2 = (String) "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s , which price is $ %.2f%n", product1, price1);
		System.out.printf("%s , which price is $ %.2f%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		Locale.setDefault(Locale.US);
		System.out.printf("%s , which price is $ %.2f%n", product1, price1);

	}

}
