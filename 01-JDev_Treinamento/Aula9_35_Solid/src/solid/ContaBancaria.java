package solid;

public class ContaBancaria {
	private String descricao;
	private double saldo = 8000.00;
	
	public void soma100reais() {
		saldo += 100;
	}
	
	public void diminue100() {
		saldo -= 100;
	}
	
	public void sacar(double sacar) {
		saldo -= sacar;
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria descricao = " + descricao + ", saldo=" + saldo + "";
	}
	
	
}
