package entities;

public class Account {
    private int number;
    private String titular;
    private double balance;

    // Contrutores

    public Account(int number, String titular, double initialDeposit) {
        this.number = number;
        this.titular = titular;
        deposit(initialDeposit);
    }
    public Account(int number, String titular) {
        this.number = number;
        this.titular = titular;

    }

    public int getNumber() {
        return number;
    }

    /* - o numero da conta não pode ser alterado
    public void setNumber(int number) {
        this.number = number;
    }
    */

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

   /* O saldo so pode ser alterado por meio de saque e deposito
   public void setBalance(double balance) {
        this.balance = balance;
    }
   */

    //Métodos
    public void deposit(double quantia) {
        this.balance += quantia;
    }
    public void withdraw(double quantia) {
        this.balance -= quantia + 5.0;
    }
    // toString
    public String toString() {
        return "Account "
                + "number: " + number
                + ", titular: " + titular
                + ", balance: " + balance;

    }
}//fim da classe
