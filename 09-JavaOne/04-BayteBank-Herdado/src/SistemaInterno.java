
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if(autenticou) {
			System.out.println("Logado com sucesso!");
		}else {
			System.out.println("Usuário não identificado");
		}
	}
}
