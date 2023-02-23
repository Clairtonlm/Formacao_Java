package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Clair", 10);
		Aluno a2 = new Aluno("Bia",8.9);
		Aluno a3 = new Aluno("Joau", 6.8);
		Aluno a4 = new Aluno("paulo", 5.4);
		Aluno a5 = new Aluno("Zirok", 9.1);
		Aluno a6 = new Aluno("Arron", 4.9);
		
		/*
		 * Quero filtar os alunis aprovado que tiveram notas acima de 7 e mostrar 
		 * uma mansagem de aprovado
		 */
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabéns " + a.nome + " ! Voce foiaprovado";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);

	}

}
