package fundamentos;

import java.util.Scanner;

public class TiposStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");//true
        /*
         * Se for comprar String use o metodo .equals ao inves de ==
         * next() ja tira os espaços em branco
         * .trim() retira os espaço em branco da digitação
         * nextLine() não tira os espaços em branco
         */
        String s1 =  new String("2");
        System.out.println("2" == s1);//false
        
        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.nextLine();//espera que usuario digite
        System.out.println(s2);

        System.out.println("2" ==s2.trim());
        System.out.println("2".equals(s2.trim()));
    
    }
} 