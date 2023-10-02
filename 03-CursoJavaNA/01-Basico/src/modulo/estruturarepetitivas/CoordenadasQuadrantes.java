package modulo.estruturarepetitivas;

import java.util.Scanner;

public class CoordenadasQuadrantes {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a coordenada X (ou 0 para sair):");
            int x = scanner.nextInt();

            if (x == 0) {
                break; // Sai do loop se a coordenada X for 0
            }

            System.out.println("Digite a coordenada Y (ou 0 para sair):");
            int y = scanner.nextInt();

            if (y == 0) {
                break; // Sai do loop se a coordenada Y for 0
            }

            if (x > 0 && y > 0) {
                System.out.println("O ponto (" + x + ", " + y + ") pertence ao 1º quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("O ponto (" + x + ", " + y + ") pertence ao 2º quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("O ponto (" + x + ", " + y + ") pertence ao 3º quadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("O ponto (" + x + ", " + y + ") pertence ao 4º quadrante.");
            } else {
                System.out.println("O ponto (" + x + ", " + y + ") está sobre um dos eixos.");
            }
        }

        scanner.close();
    }
}
