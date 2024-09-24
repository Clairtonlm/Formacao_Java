import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.println("digite um temperatura em Celsius: ");
            double c = sc.nextDouble();
            double F = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Temperatura em Fahrenheit: %.2f%n", F);
            System.out.print("Deseja repetir (s/n): ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        System.out.println("Fim do programa");
        sc.close();
    }
}
