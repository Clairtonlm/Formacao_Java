package lambdas;

import java.util.Objects;

public class Produto {
String nome;
Double preco;
Double desconto;

public Produto(String nome, Double valor, Double desconto) {
	this.nome = nome;
	this.preco = preco;
	this.desconto= desconto;
	
}

@Override
public int hashCode() {
	return Objects.hash(desconto, nome, preco);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	return Objects.equals(desconto, other.desconto) && Objects.equals(nome, other.nome)
			&& Objects.equals(preco, other.preco);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getValor() {
	return preco;
}

public void setValor(Double valor) {
	this.preco = valor;
}

public Double getDesconto() {
	return desconto;
}

public void setDesconto(Double desconto) {
	this.desconto = desconto;
}

}
