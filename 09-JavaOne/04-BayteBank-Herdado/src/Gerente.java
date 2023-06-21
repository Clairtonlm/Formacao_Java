
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;


	public Gerente() {
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
	
	
	
	//reescrita de metodo
		public double getBonificacao() {
			System.out.println("Gerente");
			return  super.getSalario();
		}
	
	
	
	
	
}//fim da classe
