package br.com.bytebanck.banco.modelo;
import br.com.bytebanck.banco.modelo.*;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Poupanca, " + super.toString();
	}
}
