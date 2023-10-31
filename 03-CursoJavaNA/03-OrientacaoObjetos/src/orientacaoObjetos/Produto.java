package orientacaoObjetos;

public class Produto {
	private String nome;
	public double preco;
	public int quantidade;
	
	
	
	//construtores
	public Produto() {
		
	}
	public Produto(String nome, double preco, int quantidde) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidde;
	}
	
	//sobrecarga-> mesmo nome com diferentes paramentros
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0;//opcional
	}
	
	
	//metodos
	public double totalEmEstoque() {
		return preco * quantidade;
}
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
				+ ", $ " 
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidade(s), Total : $ "
				+ String.format("%.2f", totalEmEstoque());
				
				
	}
}