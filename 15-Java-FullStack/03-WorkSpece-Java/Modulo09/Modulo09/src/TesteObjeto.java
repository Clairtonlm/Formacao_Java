package Modulo09.Modulo09.src;

public class TesteObjeto {
    public static void main(String[] args) {
        ComparacaoObjeto pessoa1 = new ComparacaoObjeto();
        pessoa1.setNome("Tadeu");
        pessoa1.setIdade(23);

        ComparacaoObjeto pessoa2 = new ComparacaoObjeto();
        pessoa2.setNome("Tadeu");
        pessoa2.setIdade(40);



        System.out.println("Pessoa 1: " + pessoa1.toString());
        System.out.println("Pessoa 2: " + pessoa2.toString());

        if(pessoa1.equals(pessoa2)){
            System.out.println("São iguais");
        }else {
            System.out.println("São pessoas diferentes");
        }
    }
}
