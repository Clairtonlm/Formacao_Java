package animais;
//nao pode esanciar uma classe Animal
public  abstract class Animal {

    static int numeroDePassaros;
    protected String nome;
    protected String cor;
    protected double peso;
    protected String estadoDeEspirito;

    
    
    public void comer(){

    }

    public void dormir(){

    }

    //metodo abrstado é obrigado as classes filhas implementar do seu jeito
    public abstract void soar();

    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

    public static void setNumeroDePassaros(int numeroDePassaros) {
        Animal.numeroDePassaros = numeroDePassaros;
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


}