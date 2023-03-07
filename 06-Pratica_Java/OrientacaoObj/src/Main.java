
public class Main {

	public static void main(String[] args) {
		//Instanciar uma pessoa
		Pessoa p = new Pessoa("Pessoa", "002003004");
		p.imprimir();
		
		System.out.println("\n--------------------");
		//Intanciar um Aluno
		Pessoa aluno = new Aluno("Zary", "003004005", 12345, 9.5);
		aluno.imprimir();
		
		System.out.println("\n--------------------");
		//Instanciar um Professor
		Pessoa professor = new Professor("Jão", "0050060078-2", 3.560, "002", "Laboratório");
		professor.imprimir();
	}

}
