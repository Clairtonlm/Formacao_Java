package animais;

public class Cachorro {
    //atributos
    public String      nome;
    public String      cor;
    public int         altura;
    public double      peso;
    public String      estadoDeEspirito;

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
    if(acao.equalsIgnoreCase("carinho")){
        this.estadoDeEspirito = "feliz";
    }else if(acao.equalsIgnoreCase("vai dormir")){
        this.estadoDeEspirito = " Bravo";
    } else{
        this.estadoDeEspirito = " neutro";
    }
        return estadoDeEspirito; 

}



}//fim da class cacchorro