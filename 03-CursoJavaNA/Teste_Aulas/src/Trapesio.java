import java.util.Scanner;

public class Trapesio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double B, H, b, area;
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor de H: ");
        H = sc.nextDouble();
        area = (b + B) / 2 * H;

        System.out.println(area);
        sc.close();
    }
}
