package br.com.bytebanck.banco.modelo;

public abstract class Conta {
	//atributos
	protected double saldo;
	private double agencia;
	private int numero;
	private Cliente titular;//titular é do tipo cliente que é uma classe
	//Cliente titular = new Cliente();
	private static int total;
	
	
	//construtores
	public Conta() {
		
	}
	/**
	 * Construtor para inicializar um objeto do tipo conta.
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		//Conta.total++;
		//System.out.println("O total de conta é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	//Metodos
	 public abstract void deposita( double valor);
	 
	//Vamos refatorar esse codigo usando Excecao logo abaixo
//	public boolean saca(double valor){
//		 if(this.saldo >= valor) {
//			 this.saldo -= valor;
//			 return true;
//		 }else {
//			 return false;
//		 }
//	 }
	 
	public void saca(double valor) throws SaldoInsuficienteException  {
		
		 if(this.saldo < valor)  {
//se o saldo é menor que valor temos um problema vamos lançar uma exceção
			throw new SaldoInsuficienteException ("Seu Saldo é :R$" + this.saldo + ", Valor solicitado para saque é :R$ " + valor);
					
			
		 }
		 this.saldo -= valor;
	 }
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	//Getts e Seters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("Não é permitido número negativo");
			return;
		}
		this.numero = numero;
		//pode fazer validações aqui dentro do set
	}
	public double getAgencia() {
		return this.agencia;
	}
	public void setAgencia(double agencia) {
		if(agencia <= 0) {
			System.out.println("Não permite Agência com  valor negativo");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	//equals
	
	public boolean ehIgual(Conta outra) {
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
	
}
