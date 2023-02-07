package Coleções;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Clairton");
		usuarios.put(2, "Fabiane");
		usuarios.put(3, "Mell");
		usuarios.put(4, "Noah");
		
		
		System.out.println(usuarios);
		//System.out.println(usuarios.replace(1, "clairton"));
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.get(3));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
			
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}

}
