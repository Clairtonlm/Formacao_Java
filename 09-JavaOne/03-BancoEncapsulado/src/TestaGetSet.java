
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = " 1237";//nao compila
		conta.setNumero(99999);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("Zord");
		System.out.println(paulo.getNome());
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Designer");
		

	}

}