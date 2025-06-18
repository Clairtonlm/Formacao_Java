public class Aluno {
    String nome;
    int idade;
    String dataNascimento;
    String numeroCpf;

    //Construtor
    public Aluno(){
    }
    public Aluno(String nome, int idade, String dataNascimento, String numeroCpf){
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.numeroCpf = numeroCpf;
    }
    public Aluno(String nomePadrao){
        this.nome = nomePadrao;
    }
}
