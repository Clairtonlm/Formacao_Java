package contabancaria;

public class Conta {

	private String name;
	private double saldo;
	
	
	public Conta(String name, double saldo) {
		this.name = name;
		if(saldo < 0) {
			System.out.println("Entrou no cheque especial");
			this.saldo = saldo;
		}
		this.saldo = saldo;
	}

	public void depositar(double deposito) {
		if(deposito > 0){
			saldo = this.saldo + deposito;
		}
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}//fim dos metodos
	
	
	
	
	
}//Fim do Programa
