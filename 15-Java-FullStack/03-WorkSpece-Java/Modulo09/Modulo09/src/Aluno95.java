package Modulo09.Modulo09.src;

public class Aluno95 {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;

    private double nota1;
    private String disciplina1;
    private double nota2;
    private String disciplina2;
    private double nota3;
    private String disciplina3;
    private double nota4;
    private String disciplina4;


    //Construtores em Java
    public Aluno95() {//cria os dados na memoria - sendo padrão no java

    }

    public Aluno95(String nomePadrao) {
        this.nome = nomePadrao;
    }

    public Aluno95(String nomePadrao, int idadePadrao) {
        this.nome = nomePadrao;
        this.idade = idadePadrao;
    }

    //Getters e Setters
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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    //Métodos
    /* Metodo que calcula nota do aluno*/
    public double mediaAluno() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
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
                " -nome=> " + nome  + "\n" +
                " -idade=> " + idade + "\n" +
                " -dataNascimento=> " + dataNascimento +  "\n" +
                " -cpf=> " + cpf  + "\n" + "---------------------" + "\n" +
                "Disciplina 01: " + disciplina1 +  " Media1=> " + nota1 + "\n" +
                "Disciplina 02: " + disciplina2 +  " Média2=> " +nota2 + "\n" +
                "Disciplina 03: " + disciplina3 +  " Media3=> " + nota3 + "\n" +
                "Disciplina 04: " + disciplina4 +  " Media4=> " + nota4 + "\n";

    }
}//fim da classe
