import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Fazer um programa que lê números interios que seja diferente de zero e se for difitado zero\n" +
                "pare o programa e some os números digitados");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma += x;
            System.out.println("Digite um número");
            x = sc.nextInt();
        }
        System.out.println("Você digitou Zero. Fim do programa");
        System.out.println("Valor da soma dos numeros digitados " + soma);



        sc.close();
    }
}