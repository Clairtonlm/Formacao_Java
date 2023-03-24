package escola_dev;

import java.util.Objects;

public class Diretor extends Pessoa {
	private String registroEducacao;
	private int tempoDirecao= 3;
	private String titulacao;
	
	
	//Metodos Getters e Setters
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(registroEducacao, tempoDirecao, titulacao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(registroEducacao, other.registroEducacao)
				&& Objects.equals(tempoDirecao, other.tempoDirecao) && Objects.equals(titulacao, other.titulacao);
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Registro de Educação: " + this.registroEducacao);
		System.out.println("Tempo de Direção: " + this.tempoDirecao);
		System.out.println("Titulaçõa: " + this.titulacao);
	}
	
	
	
	
}
