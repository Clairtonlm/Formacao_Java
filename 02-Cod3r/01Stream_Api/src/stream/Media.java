package stream;

public class Media {

    private double total;
    private int quantidade;

    public  Media adicionar(double valor){
        total += valor;
        quantidade++;
        return this;
    }
    public double getValor(){
        return  total / quantidade;
    }
}
