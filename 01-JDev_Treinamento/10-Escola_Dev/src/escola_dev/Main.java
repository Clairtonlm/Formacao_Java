package escola_dev;

public class Main {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		aluno.setNome("Zord de Marte");
		aluno.setIdade(22);
		aluno.maiorDeIdade();
		
		Pessoa diretor = new Diretor();
		diretor.setNome("Jeronimo");
		diretor.setIdade(56);
		
		Pessoa secretario = new Secretario();
		secretario.setNome("Theo");
		secretario.setIdade(23);
		
		
		System.out.println(aluno.maiorDeIdade());
		System.out.println(diretor.maiorDeIdade());
		System.out.println(secretario.maiorDeIdade());

	}

}
