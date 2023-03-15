package EscolaVelha;

import java.awt.Component;

import escolanova.AlunoEn;

/*Esta nossa classe/objeto que representa o Aluno*/
public class Aluno {
	/* Esses são atributos da classe Aluno*/
	private String nome;
	int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	//dentro da classe Aluno vamos criar um Objeto Disciplina
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
//essa forma nao é melhor forma de se fazer ja ja vamos ver a melhor forma com outro codigo.
//estar procedural	
	
	
	public Aluno() {/*cria os dados na memoria - sendo padrão java*/
		
	}
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
/* VEREMOS OS METODOS GETTRS E SETTRS
 * GETTERS---> PARA RETORNAR/OBTER OS DADOS, VEM PRA NOS OS DADOS
 * SETTERS---> PARA RECEBER OS DADOS
 * */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	//Metodo que retona a média do Aluno
	public double getMediaNota(){
		return (disciplina.getNota1() + disciplina.getNota2()
		+ disciplina.getNota3() + disciplina.getNota4())/4;
	}
	/*Metodo usando String*/
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return "Aprovado";
		}else {
			return "REPROVADO";
		}
	}
	/*Metodo que retorna True e false*/
	public boolean getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return true;
		}else {
			return false;
		}
	
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ","
				+ " dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ","
				+ " nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	public void set(int pos, AlunoEn trocar) {
		// TODO Auto-generated method stub
		
	}
	public Component getMaterias() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	}
	
	
	

