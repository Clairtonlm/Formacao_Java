package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		AlunoFilter a1 = new AlunoFilter("Zuroc", 7.5);
		AlunoFilter a2 = new AlunoFilter("Ryan", 8.9);
		AlunoFilter a3 = new AlunoFilter("Notrialc", 9.1);
		AlunoFilter a4 = new AlunoFilter("Maty", 5.4);
		
		List<AlunoFilter> alunos = Arrays.asList(a1, a2, a3, a4);
		
		
		Predicate<AlunoFilter> aprovados = a -> a.nota >=7;
		Function<AlunoFilter, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somataorio = (a, b) -> a + b;
		
		//Criar o stream da aplicação
		alunos.parallelStream()
			.filter(aprovados)
			.map(apenasNota)
			.reduce(somataorio)
			.ifPresent(System.out::println);
	}

}
