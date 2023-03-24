package escola_dev;

import java.util.Objects;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numetoCpf;
	private String nomePai;
	private String nomeMae;
	
	
	//Metodos Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumetoCpf() {
		return numetoCpf;
	}
	public void setNumetoCpf(String numetoCpf) {
		this.numetoCpf = numetoCpf;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	//Metodo para saber se é maior de 18 anos
	public boolean maiorDeIdade() {
		return this.idade >= 18;
	}
	
	//Equals
	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, idade, nome, nomeMae, nomePai, numetoCpf, registroGeral);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(numetoCpf, other.numetoCpf)
				&& Objects.equals(registroGeral, other.registroGeral);
	}
	
	void imprimir() {
		System.out.println("\nNOme: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Rg: " + this.registroGeral);
		System.out.println("CPF: " + this.numetoCpf);
		System.out.println("Nome do pai: " + this.nomePai);
		System.out.println("Nome do mae: " + this.nomeMae);
	}
	
	
	
	
	
	
	
}
