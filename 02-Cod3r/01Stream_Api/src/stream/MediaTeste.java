package stream;

public class MediaTeste {

    Media m1 = new Media();
   
    public static void main(String[] args) {
        
        Media m1 = new Media();
        m1.adicionar(8.9);
        m1.adicionar(6.9);

        System.out.println(" Média é " + m1.getValor());
    }

   

}
