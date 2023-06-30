
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double valorAsacar = valor + 1;
		super.saca(valorAsacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
}
