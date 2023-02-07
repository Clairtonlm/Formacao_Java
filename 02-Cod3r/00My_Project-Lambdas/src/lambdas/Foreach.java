package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Fab", "Mel", "Cla");
		
		System.out.println("____Forma Tradicional de Fazer_____");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nLambda na versão #01\n");
		aprovados.forEach((nome)->{
			System.out.println(nome + "!!!");
		});
		
		System.out.println("\nLambda na versão #02\n");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Refence...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nMethod Refence #02...");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void  meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}
}
