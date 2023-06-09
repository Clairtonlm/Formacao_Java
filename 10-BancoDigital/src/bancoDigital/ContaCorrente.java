package bancoDigital;

public class ContaCorrente extends Conta {
	
	private static final int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 0;

	public ContaCorrente() {
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;	
		
		
		
	}



 
	
	
}//fim


