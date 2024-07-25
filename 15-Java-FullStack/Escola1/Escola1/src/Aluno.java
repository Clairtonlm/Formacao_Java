public class Aluno {
    String nome;
    int idade;
    String numeroCpf;

    //Construtor
    public Aluno(){
    }
    public Aluno(String nome, int idade, String numeroCpf){
        this.nome = nome;
        this.idade = idade;
        this.numeroCpf = numeroCpf;
    }
    public Aluno(String nomePadrao){
        this.nome = nomePadrao;
    }
}
