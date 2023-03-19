package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

public class Aluno {

	private String nome;
	private int idade;

	// dentro da classe Aluno vamos criar um Objeto Disciplina
	// Vamos criar o List

	private List<Disciplina> materias = new ArrayList<Disciplina>();

	public void setMaterias(List<Disciplina> materias) {
		this.materias = materias;
	}

	public List<Disciplina> getMaterias() {
		return materias;
	}

	/* cria os dados na memoria - sendo padrão java */
	public Aluno() {

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
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
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	// Metodo que retona a média do Aluno
	public double getMediaNota() {
		double somaNotas = 0;
		for (Disciplina materias : materias) {
			somaNotas += materias.getNota1();
		}
				
		return somaNotas / materias.size();
	}

	/* Metodo usando String */
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 5.0) {
			if(media >= 6.0) {
				//usando a classe StatusAluno como static
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			 return StatusAluno.REPROVADO;
		}
		
	}
	

	@Override
	public String toString() {
		return "Estudante [nome= " + nome + ", idade= " + idade + "]";
	}

	public void setMaterias(String string) {
		
		
	}

}
