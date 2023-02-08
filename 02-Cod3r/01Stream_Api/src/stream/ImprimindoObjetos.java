package stream;

import java.util.Arrays;
import java.util.List;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Aluno1", "Aluno2", "Aluno3", "Aluno4");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
			
		}
		
	}// Fim Main

}//Fim da Class
