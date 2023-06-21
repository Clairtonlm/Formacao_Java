
public class Admintrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;


	public Admintrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
