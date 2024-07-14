import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double y = 10.3756;
        String nome = "Maria";
        int idade = 34;
        double salario = 10000;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, salario);

        System.out.println("Hello world!");
        System.out.printf("%.2f\n", y);
        System.out.printf("%.4f%n", y);// com quatro casas decimais
    }
}