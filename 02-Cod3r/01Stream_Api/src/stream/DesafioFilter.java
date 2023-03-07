package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		CarroFilter c1 = new CarroFilter("Palio", "Preto", false);
		CarroFilter c2 = new CarroFilter("Way", "Cinza", true);
		CarroFilter c3 = new CarroFilter("Cronos", "Branco", true);
		CarroFilter c4 = new CarroFilter("Corola", "Amarelo", false);
		CarroFilter c5 = new CarroFilter("Renaurt", "Preto", false);
		
		List<CarroFilter> carros = Arrays.asList(c1,c2,c3, c4, c5);
		
		Predicate<CarroFilter> economico = c -> c.economico;
		
		Function<CarroFilter, String> verificar = 
				c -> "Carros conomico -->  " + c.nome;
		
		carros.stream()
			.filter(economico)
			.map(verificar)
			.forEach(System.out::println);
		

	}

}
