package herancaEpolimorfismo;

public class Pessoa {
    String nome;
    int idade;
    String documento;

    public Pessoa(String nome, int idade, String documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    void imprimirDados() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("N° Dcoumento: " + this.documento);
    }




}


