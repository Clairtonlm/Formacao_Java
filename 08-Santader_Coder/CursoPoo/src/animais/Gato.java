package animais;

public class Gato {
    //atributos
    static int numeroDeGatos;
    private String nome;
    private String cor;
    private double peso;
    private String estadoDeEspirito;


   
    //Construtores
    public Gato(){

    }
    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    public Gato(String nome, String cor, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        
        numeroDeGatos ++;
    }


    //metodos

    public void comer(){

    }

    public void dormir(){

    }

    public void soar() {
        System.out.println("MIauuuuuuu");
    }

    public static void setNumeroDeGatos(int numeroDeGatos) {
        Gato.numeroDeGatos = numeroDeGatos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + "]";
    }




}//fim class gato