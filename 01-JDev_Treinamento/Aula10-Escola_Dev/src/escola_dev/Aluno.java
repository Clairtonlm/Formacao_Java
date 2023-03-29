package escola_dev;

import java.util.Objects;

public class Aluno extends Pessoa{
	private String matricula;
	private String dataMatricula;
	private String serieMatriculado;
	private String disciplinas;
	
	
	
	//Matodos getters Setters
	public String getMatricula() {
		return matricula;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, disciplinas, matricula, serieMatriculado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(matricula, other.matricula)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public String getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	//Identifica método da superClasse e modifico sobreescrevendo
	//como estar privado uso super.getAlumacoisaquequero();
	@Override
	public boolean maiorDeIdade() {
		
		return super.getIdade() >= 21;
	}
	
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Matricula do Aluno(a): " + this.matricula);
		
		
	}
	@Override
	public double salario() {
		
		return 0;
	}
	
	
	
	
}
