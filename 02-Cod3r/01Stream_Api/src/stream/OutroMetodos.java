package stream;

import java.util.Arrays;
import java.util.List;

public class OutroMetodos {

	public static void main(String[] args) {
		
		AlunoFilter a1 = new AlunoFilter("Zuroc", 7.5);
		AlunoFilter a2 = new AlunoFilter("Ryan", 3.9);
		AlunoFilter a3 = new AlunoFilter("Notrialc", 9.1);
		AlunoFilter a4 = new AlunoFilter("Maty", 7.4);
		AlunoFilter a5 = new AlunoFilter("Zuroc", 7.5);
		AlunoFilter a6 = new AlunoFilter("Ryan", 3.9);
		AlunoFilter a7 = new AlunoFilter("Noah", 9.1);
		AlunoFilter a8 = new AlunoFilter("Mary", 7.4);

		
		List<AlunoFilter> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct-> Tira os elementos iguais");
		alunos.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.skip(2)
		//.distinct()
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);

		

	}

}
