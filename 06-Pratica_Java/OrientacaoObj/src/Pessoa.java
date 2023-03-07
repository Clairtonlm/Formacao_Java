
public class Pessoa {
	private String nome;
	private String cpf;
	
	
	//construtor
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Método void para imprimir
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		
	}

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
	
	
	
}
