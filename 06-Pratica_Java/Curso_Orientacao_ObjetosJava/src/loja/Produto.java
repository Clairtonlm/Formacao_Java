package loja;

public class Produto {

	private Long id;
	private String nome;
	private double valor;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}
	
	
	
}
