package bytebanck1;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 200;
		conta.deposita(100);
		System.out.println(conta.saldo);
	}

}
