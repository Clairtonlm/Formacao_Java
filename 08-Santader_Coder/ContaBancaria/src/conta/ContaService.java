package conta;

public class ContaService {

	private static int numeroConta = 0;

    public Conta abrirConta(double saldoInicial) {
        numeroConta++;
        return new Conta(numeroConta, saldoInicial);
    }
}
