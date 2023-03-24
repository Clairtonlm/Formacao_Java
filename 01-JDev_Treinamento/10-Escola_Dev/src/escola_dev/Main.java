package escola_dev;

public class Main {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		aluno.setNome("Zord de Marte");
		aluno.setIdade(22);
		aluno.setDataNascimento("02/07/2009");
		aluno.setRegistroGeral("00030003");
		aluno.setNumetoCpf("002.003.004-09");
		aluno.setNomePai("Chico da Silva");
		aluno.setNomeMae("Naria da Rocha");
		
		
		
		
		
		Pessoa diretor = new Diretor();
		diretor.setNome("Jeronimo");
		diretor.setIdade(56);
		
		
		Pessoa secretario = new Secretario();
		secretario.setNome("Theo");
		secretario.setIdade(23);
		
		System.out.println("----Imprimindo dados------");
		aluno.imprimir();
		diretor.imprimir();
		secretario.imprimir();
		
		System.out.println("\n---Testar se é maior de idade---");
		System.out.println(aluno.maiorDeIdade());
		System.out.println(diretor.maiorDeIdade());
		System.out.println(secretario.maiorDeIdade());

	}

}
