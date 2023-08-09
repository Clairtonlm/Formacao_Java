package br.com.clairton.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//essa classse é uma entidde do banco de dados
@Entity
@Table(name = "produtos")

public class Produto {
	// nome do atributo eJPA ja sabe que é igual a coluna na tebela no BD
	// se a coluna é diferente do nome do atributo
	// usa @Comlumm(name= "desc")
	// devemos obrigatoriamente dizer quem é chave primaria
	// devemos dizer quem vai gerir o id é o BD
	////dentro da persistence.xml tem que declarar o caminho de cada classe que foi criada. 
	//O hibernet cosegue fazer isso eutomaticamente

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
