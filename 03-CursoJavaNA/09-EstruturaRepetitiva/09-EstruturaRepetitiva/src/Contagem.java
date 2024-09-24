import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do contagem: ");
        //int n = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("valor de n: " + i);
        }
        sc.close();
    }
}
