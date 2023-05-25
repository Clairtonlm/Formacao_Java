package animais;

import loja.Petshop;

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

        Petshop petshop = new Petshop();
       petshop.darBanho(cachorro1);
       System.out.println(cachorro1.getEstadoDeEspirito());

       petshop.tosar(cachorro1);
       System.out.println(cachorro1.getEstadoDeEspirito());

       //formas de criar objeto
        Gato gato5 = new Gato();

        Animal gato2 = new  Gato();
        
        //Gato gat03 = new Animal();//isso é errado

        //Animal gato4 = new Animal(); isso nao pode pq é uma classe abstrata

        Animal passaro1 = new Passaro();
        passaro1.soar();
       
    }//main

}//fim main