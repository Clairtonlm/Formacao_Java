package stream;

import java.util.Objects;

public class AlunoFilter {
	final String nome;
	final double nota;
	 boolean bomCompotamento;
	 
	 public AlunoFilter( String nome, double nota) {
		 this(nome, nota, true);
	 }
	
	public AlunoFilter(String nome, double nota,boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomCompotamento = bomComportamento;
		
	}

	@Override
	public String toString() {
		return  "Aluno = "+ nome + ", nota= " + nota + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomCompotamento, nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoFilter other = (AlunoFilter) obj;
		return bomCompotamento == other.bomCompotamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
	
	
	
}
