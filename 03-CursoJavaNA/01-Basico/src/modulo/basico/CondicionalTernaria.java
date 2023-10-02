package modulo.basico;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// Sintaxe
		// (condição) ? valor_se_verdadeiro : valor se falso;
		
		double preco = 34.5;
		//aplicando condição Ternaria
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		//jeito normal de fazer
//		if(preco <= 20.0) {
//			desconto = preco * 0.1;
//		}else {
//			desconto = preco * 0.85;
//		}
		
		//aplicando condição Ternaria
		
		System.out.println(" O desconto foi de " + desconto);
		
		}//main

}//class
