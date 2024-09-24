import java.util.Scanner;

public class NumerosFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número inteiro");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        sc.close();
    }
}
