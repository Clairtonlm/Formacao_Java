package Modulo09.Modulo09.src;

public class Aluno95 {
    private String       nome;
    private int          idade;
    private String      dataNascimento;
    private String      cpf;

    private Disciplina disciplina = new Disciplina();



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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    //Métodos
    /* Metodo que calcula nota do aluno*/
    public double mediaAluno() {
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
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
                "idade=> " + idade + "\n" +
                "dataNascimento=> " + dataNascimento +  "\n" +
                "cpf=> " + cpf  + "\n" + "---------------------" + "\n"+
                "Disciplina " + disciplina;
    }
}//fim da classe
