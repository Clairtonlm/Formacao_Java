
public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorAsacar = valor + 1;
		return super.saca(valorAsacar);
	}
}
