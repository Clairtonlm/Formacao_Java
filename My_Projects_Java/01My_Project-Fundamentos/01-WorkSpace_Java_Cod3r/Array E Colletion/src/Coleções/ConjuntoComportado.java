package Coleções;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
//		Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Clairton");
		lista.add("Fabiane");
		lista.add("Mell");
		lista.add("Noah");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		
	}

}
