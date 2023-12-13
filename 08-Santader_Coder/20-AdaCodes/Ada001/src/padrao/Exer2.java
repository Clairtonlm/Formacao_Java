package padrao;
/*
 * Escreva um programa em Java que solicita ao usuário um número inteiro (n). 
 * O programa deve verificar se o número é primo e imprimir uma mensagem indicando o resultado.
 * */
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo maior que 1: ");
        int n = scanner.nextInt();
        
        if (isPrimo(n)) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        
        scanner.close();
    }
    
    // Função para verificar se o número é primo
    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
