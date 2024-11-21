package Application;

import java.util.Scanner; // Importing Scanner
import entities.ContaBancaria; // Importing ContaBancaria (adjust the package as necessary)

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // consumir o restante da linha

        System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Haverá um depósito inicial? (s/n): ");
        char temDepositoInicial = sc.next().charAt(0);

        ContaBancaria conta;
        if (temDepositoInicial == 's' || temDepositoInicial == 'S') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numero, titular, depositoInicial);
        } else {
            conta = new ContaBancaria(numero, titular);
        }

        System.out.println("\nDados da conta:");
        System.out.println(conta);

        System.out.print("\nDigite um valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.println("\nDados atualizados da conta:");
        System.out.println(conta);

        System.out.print("\nDigite um valor para saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        System.out.println("\nDados atualizados da conta:");
        System.out.println(conta);

        sc.close();
    }
}

