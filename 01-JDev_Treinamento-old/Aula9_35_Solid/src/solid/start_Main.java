package solid;

public class start_Main {

	public static void main(String[] args) {
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta Bancaria do Zyron");
		
		System.out.println(bancaria);
		bancaria.diminue100();
		System.out.println(bancaria);
		bancaria.sacar(900);
		System.out.println(bancaria);
		bancaria.soma100reais();
		System.out.println(bancaria);
	}

}
