package Modulo09.Modulo09.src;

public class Aluno95 {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;

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
}//classe
