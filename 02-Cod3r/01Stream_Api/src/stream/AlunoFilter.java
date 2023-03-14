package stream;

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
		return "AlunoFilter [nome=" + nome + ", nota=" + nota + "]";
	}
	
	
	
	
	
	
}
