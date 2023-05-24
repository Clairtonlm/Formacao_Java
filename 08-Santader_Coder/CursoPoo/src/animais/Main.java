package animais;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome= "Banby";
        cachorro1.cor= "Preto";
        cachorro1.peso= 8.3;
        cachorro1.altura= 5;
        System.out.println(cachorro1);

        cachorro1.latir();
        System.out.println("cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("Carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));




    }//main

}//fim main