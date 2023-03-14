package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		AlunoFilter a1 = new AlunoFilter("Zuroc", 7.5);
		AlunoFilter a2 = new AlunoFilter("Ryan", 3.9);
		AlunoFilter a3 = new AlunoFilter("Notrialc", 9.1);
		AlunoFilter a4 = new AlunoFilter("Maty", 7.4);
		
		List<AlunoFilter> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<AlunoFilter> melhorNota = (al1, al2) -> {
			if(al1.nota > al2.nota) return 1;
			if(al1.nota < al2.nota) return -1;
			return 0;
	};
	System.out.println(alunos.stream().max(melhorNota).get());//melhor nota
	System.out.println(alunos.stream().min(melhorNota).get());//pior nota
	
	}
	
	
}//Fim class
