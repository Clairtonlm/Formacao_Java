package entidades;


public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    
  //construtores    
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//metodos da conta
	public void deposito(double valor) {
		saldo += valor;
	}
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	public String toString() {
		return " Conta "
				+ numero
				+ ", Titular: "
				+ titular
				+ " , Saldo: $  "
				+ String.format("%.2f", saldo);
	}
	
}//fim class
