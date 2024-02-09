package Modulo09.Modulo09.src;

import java.util.Objects;

public class ComparacaoObjeto {
    private String nome;
    private int idade;

    //Construtor
    public ComparacaoObjeto(){

    }

    public ComparacaoObjeto(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Getters e Setters
    public  String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String toString(){
        return "Dados do Objeto" + "\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComparacaoObjeto that)) return false;
        return getIdade() == that.getIdade() && Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade());
    }
}
