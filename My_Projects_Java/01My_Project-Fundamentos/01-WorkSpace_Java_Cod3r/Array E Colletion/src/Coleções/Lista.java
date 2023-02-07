package Coleções;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Clairton"));
		lista.add(new Usuario("Luiza Mell"));
		lista.add(new Usuario("Noah Ravi"));
		
		System.out.println(lista.get(3));//Acessar pelo indice
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}

}
