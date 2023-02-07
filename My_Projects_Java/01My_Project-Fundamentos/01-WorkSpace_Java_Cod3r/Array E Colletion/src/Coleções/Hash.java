package Coleções;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Clairton"));
		usuarios.add(new Usuario("Fabiane"));
		usuarios.add(new Usuario("Luiza Mell"));
		usuarios.add(new Usuario("Noah Ravi"));
		
		boolean resultado = usuarios.contains(new Usuario("Clairton"));
		System.out.println(resultado);
	}

}
