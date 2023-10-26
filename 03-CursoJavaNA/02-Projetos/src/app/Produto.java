package app;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
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