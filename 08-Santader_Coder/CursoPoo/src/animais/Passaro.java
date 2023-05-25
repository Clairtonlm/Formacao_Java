package animais;

public class Passaro {
    
    static int numeroDePassaros;
    private String nome;
    private String cor;
    private double peso;
    private String estadoDeEspirito;

    

    //construtor
    public Passaro(){

    }
    public Passaro(String nome, String cor, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDePassaros ++;
    }

    public void comer(){

    }

    public void dormir(){

    }

    public void soar() {
        System.out.println("Piuuupiuuuu");
    }

}