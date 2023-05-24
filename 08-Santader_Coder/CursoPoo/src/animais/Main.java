package animais;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Lupi");
        cachorro1.setCor("preto");
        cachorro1.setPeso(8.3);
        cachorro1.setAltura(3);
        System.out.println(cachorro1);

        cachorro1.latir();
        System.out.println("cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));




    }//main

}//fim main