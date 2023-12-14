import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura dos triângulos: ");
        int altura = scanner.nextInt();

        System.out.println("Triângulo retângulo:");
        for (int linha = 1; linha <= altura; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); 

        for (int linha = altura; linha >= 1; linha--) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
