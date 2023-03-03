package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		AlunoFilter a1 = new AlunoFilter("Clairton", 10, true);
		AlunoFilter a2 = new AlunoFilter("Bia",8.9, true);
		AlunoFilter a3 = new AlunoFilter("Joau", 6.8, false);
		AlunoFilter a4 = new AlunoFilter("paulo", 5.4,false);
		AlunoFilter a5 = new AlunoFilter("Zirok", 9.1,false);
		AlunoFilter a6 = new AlunoFilter("Arron", 4.9,false);
		
		/*
		 * Quero filtar os alunis aprovado que tiveram notas acima de 7 e mostrar 
		 * uma mansagem de aprovado
		 */
		List<AlunoFilter> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<AlunoFilter> aprovado = a -> a.nota >=7;
		Predicate<AlunoFilter> bomCoportamento = a -> a.bomCompotamento;

		
		Function<AlunoFilter, String> saudacaoAprovado =
				a -> "Parabéns---> " + a.nome + " ! Voce foiaprovado";
		
		alunos.stream()
			.filter(aprovado)
			.filter(bomCoportamento)
			.map(saudacaoAprovado)
			.forEach(System.out::println);

	}

}
