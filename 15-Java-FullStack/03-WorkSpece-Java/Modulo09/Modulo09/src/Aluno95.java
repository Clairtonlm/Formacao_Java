package Modulo09.Modulo09.src;

public class Aluno95 {
    private String nome;
    private int    idade;
    private String dataNascimento;
    private String cpf;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


    //Construtores em Java
    public Aluno95(){//cria os dados na memoria - sendo padrão no java

    }
    public Aluno95(String nomePadrao){
        this.nome = nomePadrao;
    }
    public Aluno95(String nomePadrao, int idadePadrao){
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
    //Métodos
    /* Metodo que calcula nota do aluno*/
    public double mediaAluno(){
        return (nota1 + nota2 + nota3 + nota4)/4;
    }
}//classe
