package padrao;
/**
 * Escreva um programa em Java que solicita ao usuário um número inteiro positivo (n). 
O programa deve calcular a soma dos números
 pares de 1 até n e imprimir o resultado.
 * 
 * */

import java.util.Scanner;

public class NumPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        
        int somaPares = calcularSomaPares(n);
        
        System.out.println("A soma dos números pares de 1 até " + n + " é: " + somaPares);
        
        scanner.close();
    }
    
    // Função para calcular a soma dos números pares de 1 até n
    public static int calcularSomaPares(int n) {
        int soma = 0;
        
        for (int i = 2; i <= n; i += 2) {
            soma += i;
        }
        
        return soma;
    }
}
