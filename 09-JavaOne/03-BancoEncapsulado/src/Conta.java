

public class Conta {
	//atributos
	private double saldo;
	private double agencia;
	private int numero;
	private Cliente titular;//titular é do tipo cliente que é uma classe
	//Cliente titular = new Cliente();
	
	//Metodos
	 public void deposita( double valor){
		 this.saldo += valor;
	}
	 
	public boolean saca(double valor){
		 if(this.saldo >= valor) {
			 this.saldo -= valor;
			 return true;
		 }else {
			 return false;
		 }
	 }
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			//destisno.saldo += valor;(ou pode ser usando o metodo)
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	//Getts e Seters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
		//pode fazer validações aqui dentro do set
	}
	public double getAgencia() {
		return this.agencia;
	}
	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
}
