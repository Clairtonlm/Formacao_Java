package padrao;

public class ExemploSwitch {
    public static void main(String[] args) {
        char letra = 'B';

        int peso = switch (letra) {
            case 'A' -> 10;
            case 'B' -> 9;
            case 'C' -> 7;
            case 'D' -> 6;
            case 'E' -> 4;
            case 'F' -> 2;
            default -> 0;
        };

        System.out.println("O peso da nota '" + letra + "' é: " + peso);
    }
}

