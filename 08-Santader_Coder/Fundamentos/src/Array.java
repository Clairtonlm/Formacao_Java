import java.util.Arrays;



public class Array {
    public static void main(String[] args) {
        int[] numeros = new int[6];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;


        for(int i = 0; i <numeros.length; i++){
           if(numeros[i] > maior){
            maior = numeros[i];
           }
           if(numeros[i] < menor){
            menor = numeros[i];
           }
           media += numeros[i];
        }

        System.out.println("Maior " + maior);
        System.out.println("Manor " + menor);
        System.out.println("Media " + media/numeros.length);
        System.out.println("...........................................");
        String[] letras = {"A", "B", "C", "D"};
        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
            System.out.println("\n");

        }
       System.out.println(Arrays.toString(letras));
    }
    
}