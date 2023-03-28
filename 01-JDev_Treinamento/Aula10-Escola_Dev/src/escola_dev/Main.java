package escola_dev;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Zord de Marte");
		aluno.setIdade(22);
		aluno.setDataNascimento("02/07/2009");
		aluno.setRegistroGeral("00030003");
		aluno.setNumetoCpf("002.003.004-09");
		aluno.setNomePai("Chico da Silva");
		aluno.setNomeMae("Naria da Rocha");
		aluno.setMatricula("000005");
		
		
		
		
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Jeronimo");
		diretor.setIdade(56);
		diretor.setTitulacao("3 anos");
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Theo");
		secretario.setIdade(23);
		secretario.setRegisto("9876945786");
		
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
