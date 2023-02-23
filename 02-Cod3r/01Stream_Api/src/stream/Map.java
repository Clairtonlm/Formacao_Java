package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList(" bmw", " Palio",  " Audi");
		//Quero transformar toda lista em letra maiscula
		marcas.stream().map(m-> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n-> n + "!!!!";
		
		System.out.println("\n\nUsando Composção");
		marcas.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.map(grito)
			.forEach(print);
	}

}
