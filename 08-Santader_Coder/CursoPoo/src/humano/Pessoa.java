package humano;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cpf = "0000000000";


    
    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
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



    public Pessoa(String nome, String dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }



    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + "]";
    }

    
}