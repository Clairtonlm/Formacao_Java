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

    public String getNumeroCpf() {
        return numeroCpf;
    }
    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                '}';
    }
}
