package animais;

public class Cachorro {
    //atributos
    private String      nome;
    private String      cor;
    private int         altura;
    private double      peso;
    private String      estadoDeEspirito;


    
// metodos semretorno
public void comer() {
    System.out.println("Comeu ração");
}
public void latir() {
    System.out.println("AU AU");
}

//metodo com retorno. e o retorno tem que ser do mesmo tipo
public String pegar(){
    return "Bolinha";
}
public String interagir(String acao) {
   
   switch (acao){
    case  "carinho":this.estadoDeEspirito = "Feliz";
    break;
    case  "vai dormir": this.estadoDeEspirito = "Bravo";
    break;
    case " pisar na patinha": this.estadoDeEspirito = "Triste";
    break;
    default: this.estadoDeEspirito = " neutro";

   }
   return estadoDeEspirito;
   
    // if(acao.equalsIgnoreCase("carinho")){
      //  this.estadoDeEspirito = "feliz";
   // }else if(acao.equalsIgnoreCase("vai dormir")){
      //  this.estadoDeEspirito = " Bravo";
    //} else{
       // this.estadoDeEspirito = " neutro";
   // }
        //return estadoDeEspirito; 

}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return int return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return double return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return String return the estadoDeEspirito
     */
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    /**
     * @param estadoDeEspirito the estadoDeEspirito to set
     */
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

}