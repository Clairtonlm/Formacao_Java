package entidades;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];

        //System.out.println("Quantos números vai digitar?");
        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um número");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        System.out.println("Valores : ");
        for(int i =0; i< n; i++){
            soma += vect[i];
        }
        double media = soma /n;


        System.out.println("A soma é :"+ soma);
        System.out.println("A media é : "+ media);
        sc.close();
    }
}
