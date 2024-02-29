package model;

import java.util.Locale;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
        
        System.out.print("Digite o primeiro número ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        System.out.println("A soma dos numeros " + sum);
    }
}
