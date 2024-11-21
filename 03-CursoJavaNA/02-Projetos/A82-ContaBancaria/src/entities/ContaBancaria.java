package entities;

import java.util.Scanner;

public class ContaBancaria {
    private final int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    public ContaBancaria(int numero, String titular) {
        this(numero, titular, 0.0);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            saldo -= (valor + 5.0); // inclui a taxa de $5
            System.out.println("Saque realizado com sucesso! Taxa de $5.00 aplicada.");
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria {" +
                "Numero: " + numero +
                ", Titular: '" + titular + '\'' +
                ", Saldo: $" + String.format("%.2f", saldo) +
                '}';
    }
}

