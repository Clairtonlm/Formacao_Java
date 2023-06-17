
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1007, 01002356);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1007, 010023);
		System.out.println(Conta.getTotal());
		
	}

}
