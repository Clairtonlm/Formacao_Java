package bytebanck1;

public class Conta {
	//atributos
	double saldo;
	double agencia;
	int numero;
	String titular;
	
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
}
