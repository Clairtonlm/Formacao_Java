package entities;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

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
    // getters e settres


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    //Para proteger a quantidade do produto não tem set.

    //public void setQuantidade(int quantidade) {
    //    this.quantidade = quantidade;
    //}

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