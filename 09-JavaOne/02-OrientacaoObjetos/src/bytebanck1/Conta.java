package bytebanck1;

public class Conta {
	//atributos
	double saldo;
	double agencia;
	int numero;
	String titular;
	
	//Metodos
	 public void deposita( double valor){
		 saldo = saldo + valor;
	}
}
