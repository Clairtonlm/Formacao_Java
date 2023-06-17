
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.getSaldo());
		System.out.println(" O saque foi: "+ conta.saca(200));
		
		

	}

}
