package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler num1
        //ler num2
        //
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        //logica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %2.f", num1, op, num2, resultado);

        entrada.close();

    }
}