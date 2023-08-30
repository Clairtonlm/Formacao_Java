package entrada;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomeCompleto = teclado.nextLine();//pega linha inteira
        System.out.println("Seu nome " + nomeCompleto);

        System.out.println("Digite seu nome");
        String nome = teclado.next();//pega so um palavra
        System.out.println("Seu nome " + nome);

        System.out.println("Digite seu idade");
        int idade = teclado.nextInt();
        System.out.println("Sua idade é  " + idade);














        teclado.close();
    }
}
