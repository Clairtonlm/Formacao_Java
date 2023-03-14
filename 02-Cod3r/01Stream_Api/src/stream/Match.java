package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		AlunoFilter a1 = new AlunoFilter("Zuroc", 7.5);
		AlunoFilter a2 = new AlunoFilter("Ryan", 8.9);
		AlunoFilter a3 = new AlunoFilter("Notrialc", 9.1);
		AlunoFilter a4 = new AlunoFilter("Maty", 7.4);
		
		List<AlunoFilter> alunos = Arrays.asList(a1, a2, a3, a4);
		
		
		Predicate<AlunoFilter> aprovados = a -> a.nota >=7;
		Predicate<AlunoFilter> reprovados = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados));//todos foram aprovados
		System.out.println(alunos.stream().anyMatch(aprovados));//algum foi aprovado
		System.out.println(alunos.stream().noneMatch(reprovados));//tem aluno reprovado?
	}

}
