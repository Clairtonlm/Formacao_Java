package animais;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Lupi");
        cachorro1.setCor("preto");
        cachorro1.setPeso(8.3);
        cachorro1.soar();
        System.out.println(cachorro1);


       
        System.out.println("cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));

        Gato gato1 = new Gato();
        gato1.soar();


    }//main

}//fim main