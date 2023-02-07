package praticando;

import java.util.Scanner;

public class DesafioConvesao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário");
		String valor1 = entrada.next().replace(",",".");//replece é se o cara digitar , ou . nao dar problema no java
		
		System.out.println("Informe o segundo salário");
		String valor2 = entrada.next().replace(",",".");
		
		System.out.println("Informe o terceiro salário");
		String valor3 = entrada.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3);
		
		System.out.println(" A média dos salário é " + media );
		
		entrada.close();
	}

}
