package novaescola;

import java.util.ArrayList;
import java.util.List;

public class AlunoNE {
    private String       nome;
    private int          matricula;
    private String       dataNascimento;
    private String       cpf;

    private List<Disciplina> disciplinas = new ArrayList<>();

    //Construtores em Java
    public AlunoNE() {//cria os dados na memoria - sendo padrão no java

    }

    public AlunoNE(String nomePadrao) {
        this.nome = nomePadrao;
    }

    public AlunoNE(String nomePadrao, int matricula) {
        this.nome = nomePadrao;
        this.matricula = matricula;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    //Métodos
    /* Metodo que calcula nota do aluno*/
    public double mediaAluno() {
        double somaNotas = 0;
        for( Disciplina dis: disciplinas){
            somaNotas += dis.getNota();
        }
        return somaNotas / disciplinas.size() ;
    }

    //metodo que verifica se foi aprovado ou nao
    public boolean verificaAprovacao() {
        double media = this.mediaAluno();
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    //metodo Aprovado 2
    public String verificaAprovacao2() {
        double media = this.mediaAluno();
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }




    //to String
    @Override
    public String toString() {
        return " Dados do Aluno:" + "\n" +
                "nome=> " + nome  + "\n" +
                "idade=> " + matricula + "\n" +
                "dataNascimento=> " + dataNascimento +  "\n" +
                "cpf=> " + cpf  + "\n" + "---------------------" + "\n";
    }
}
