package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoFore {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Aluno1", "Aluno2", "Aluno3", "Aluno4");
		
		System.out.println("Usando Forreach\n--------------------\n");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nUsando Iterator\n--------------------\n");
		
		Iterator<String> it= aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		System.out.println("\nUsando Stream\n--------------------\n");
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}//fim main
	

}//fim class
