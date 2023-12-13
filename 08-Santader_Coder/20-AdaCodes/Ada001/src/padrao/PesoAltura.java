package padrao;

import java.util.Scanner;

public class PesoAltura {

	public static void main(String[] args) {
		double[] pesoAltura = obterPesoAltura();
		
		double peso = pesoAltura[0];
		double altura = pesoAltura[1];
		double imc = peso / (altura * altura);
		if(imc < 18.5) {
			return "IMC: " + imc + " - Abaixo do peso";
		}

	}
	static double[] obterPesoAltura() {
		Scanner sc =  new Scanner(System.in);
	}

}
