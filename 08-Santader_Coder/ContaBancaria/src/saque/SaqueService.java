package saque;

import conta.Conta;

public class SaqueService {
	
	 public void sacar(Conta conta, double valor) {
	        if (conta.getSaldo() >= valor) {
	            double novoSaldo = conta.getSaldo() - valor;
	            conta.setSaldo(novoSaldo);
	            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }
}
