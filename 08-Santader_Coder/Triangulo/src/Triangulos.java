import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura dos triângulos: ");
        int alturaDoTriagulo = scanner.nextInt();

        System.out.println("Triângulo retângulo:");
        for (int linha = 1; linha <= alturaDoTriagulo; linha++) {
            for (int baseDotriangulo = 1; baseDotriangulo <= linha; baseDotriangulo++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); 

        for (int linha = alturaDoTriagulo; linha >= 1; linha--) {
            for (int baseDotriangulo = 1; baseDotriangulo <= linha; baseDotriangulo++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
