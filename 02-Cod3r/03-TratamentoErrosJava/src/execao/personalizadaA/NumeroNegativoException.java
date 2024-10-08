package execao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	@Override
	public String getMessage() {
		return String.format("O atributo %s está vazio ", nomeDoAtributo);
	}
}
