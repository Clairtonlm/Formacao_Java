package teste;

import conta.Conta;
import conta.ContaService;
import saque.SaqueService;

public class TesteConta {

    public static void main(String[] args) {
        ContaService contaService = new ContaService();
        Conta conta = contaService.abrirConta(1000.0);

        System.out.println("Saldo inicial: " + conta.getSaldo());

        SaqueService saqueService = new SaqueService();
        saqueService.sacar(conta, 500.0);

        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
