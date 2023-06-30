
public class Conexao {
	
	public Conexao() {
		System.out.println("Abrindo conexação");
	}
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	public void fecha() {
		System.out.println("Fechando conexão");
	}
}
