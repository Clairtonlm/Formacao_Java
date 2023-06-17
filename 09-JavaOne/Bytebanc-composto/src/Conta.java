

public class Conta {
	//atributos
	private double saldo;
	double agencia;
	int numero;
	Cliente titular;//titular é do tipo cliente que é uma classe
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
	//Getts
	public double getSaldo() {
		return this.saldo;
	}
}
