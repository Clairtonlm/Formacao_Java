
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao();
	
	
	//Getters  e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	 void imprimir() {
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Cpf: " + this.cpf);
		 System.out.println("Salario: " + this.salario);
		 System.out.println("Bonificação:" +    this.getBonificacao());
		 System.out.println("------------------------------------");
	 }
		
	
}
