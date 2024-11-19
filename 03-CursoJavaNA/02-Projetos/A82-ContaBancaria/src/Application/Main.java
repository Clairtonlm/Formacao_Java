package Application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//ficar um ponto como separador de decimais.
        Scanner sc = new Scanner(System.in);
        Account conta;

        System.out.println("Digite o número da número da conta ");
        int number = sc.nextInt();
        System.out.println("Qual o nome do titular do conta?");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.printf("Tem deposito inicial (s/n) ");
        char resp = sc.next().charAt(0);
        if (resp == 's') {
            System.out.println("Digite o valor do deposito");
            double initialDeposit = sc.nextDouble();
            conta = new Account(number, titular, initialDeposit); // Change made here
        }
        else {
            conta = new Account(number, titular);
        }
        System.out.println();
        System.out.println("dados da conta");
        System.out.println(conta);

        //Operação de deposito
        System.out.println();
        System.out.println("Digite o valor do deposito");
        double depositoValue = sc.nextDouble();
        conta.deposit(depositoValue);
        System.out.println("Update dos dados da conta");
        System.out.println(conta);

        //Operação de saque
        System.out.println();
        System.out.println("Digite o valor do saque");
        double saqueValue = sc.nextDouble();
        conta.withdraw(saqueValue);
        System.out.println("Dados atualizados da conta");
        System.out.println(conta);
        System.out.println("Obs: A cada saque é cobrado um valor de R$ 5.00");























        sc.close();
    }//fim executor
}//fim Main