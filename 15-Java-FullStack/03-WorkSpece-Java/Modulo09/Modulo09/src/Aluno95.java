package Modulo09.Modulo09.src;

public class Aluno95 {
     String nome;
    int idade;
    String dataNascimento;
    String cpf;

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
}
