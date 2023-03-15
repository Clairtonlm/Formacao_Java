package executar;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class StartJava {

	public static void main(String[] args) {
		 Aluno al = new Aluno();
		 al.setNome("Clair");
		 
		 Disciplina disc = new Disciplina();
		 disc.setMateria("java");
		 //disc.setNota1(9.5);
		 
		System.out.println("Nome = " + al.getNome());
		System.out.println("Disciplina = " + disc.getMateria());
		System.out.println("Media é = " + disc.getNota1());
		//System.out.println("Resultado = " + al.getAlunoAprovado());
		System.out.println("\nx-------------xxxxx-----------------x-");

	}

}
