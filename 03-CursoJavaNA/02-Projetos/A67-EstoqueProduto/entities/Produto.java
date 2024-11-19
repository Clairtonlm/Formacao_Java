package entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    // Constructor
    public  Produto() {

    }
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    // Method to calculate total value in stock
    public double totalValueInStock() {
        return preco * quantidade;
    }

    // Method to add products
    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;

    }

    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }


}//fim da classe