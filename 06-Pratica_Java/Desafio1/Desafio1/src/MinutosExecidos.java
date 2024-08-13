import java.util.Scanner;

public class MinutosExecidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos minutos deu seu consumo: ");
        int minutosExecidos = sc.nextInt();

        double conta = 50.0;
        if (minutosExecidos > 100) {
            conta += (minutosExecidos - 100.0) * 2.0;

        }
        System.out.printf(" Valor da conta = R$ %.2f%n" , conta);

        sc.close();
    }
}
