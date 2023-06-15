package bytebanck1;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("---Conta cliente 1---");
		conta.saldo = 920;//saldo inicial
		conta.deposita(100);//depositei
		System.out.println(conta.saldo);//920 + 100 = 1020
		boolean fezSaque = conta.saca(2000);// saque 
		System.out.println(conta.saldo);//1020-20.80 = 999.2
		System.out.println(fezSaque);
		
		//Nova conta
		System.out.println("---Conta cliente 2---");
		Conta conta2 = new Conta();
		conta2.saldo = 1000;
		System.out.println(conta2.saldo);
		
		//invocando o medoto transfere
		if(conta2.transfere(1001, conta)) {
			System.out.println("Transferência feita com sucesso!");
		}else {
			System.out.println("Saldo insuficiente, transfência nao relaizada");
		}
		
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
	}

}
