package loja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private Long id;
	private String descricao;
	private String nomeClente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	
	private List<Produto> listaProduto = new ArrayList<Produto>();
	
	
	//Gettres e Settres
	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	
	//Metodo para addProduto na lista
	public void addProduto(Produto produto) {
		/*Posso fazer validações aqui*/
		this.listaProduto.add(produto);
	}
	
	public double totalVenda() {
		double total = 0.0;
		
		for (Produto produto : listaProduto) {
			total += produto.getValor();
		}
		return total;
	}
	
	//Gettres e Settres
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeClente() {
		return nomeClente;
	}
	public void setNomeClente(String nomeClente) {
		this.nomeClente = nomeClente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricao=" + descricao + ", nomeClente=" + nomeClente + ", enderecoEntrega="
				+ enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProduto=" + listaProduto + "]";
	}
	
	
	
	
	
}//fim class
