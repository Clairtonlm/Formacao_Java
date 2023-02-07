package estruturadecontrole;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media == 7.0) {
			System.out.println("Aprovado");
		}else if(media <=10 && media >= 7.0) {
			System.out.println("Passou");
		}
		
		boolean  criterioAtingido = media <=5 && media >=6;
		if(criterioAtingido){
			System.out.println("Recuperação");
		}
		
		
		entrada.close();

	

}
	
}
