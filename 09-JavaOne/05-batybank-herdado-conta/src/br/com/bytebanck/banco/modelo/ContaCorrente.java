package br.com.bytebanck.banco.modelo;
import br.com.bytebanck.banco.modelo.*;
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorAsacar = valor + 0.2;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente, " + super.toString();
	}
}
