package animais;

public class Cachorro extends Animal {
    //atributos
    static int numeroDeCachorros;


    
// metodos semretorno


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

    @Override
    public void soar() {
       System.out.println("Auau");
       
    }
}