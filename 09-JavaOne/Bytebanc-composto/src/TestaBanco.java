
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Jose";
		paulo.cpf= "000.000.000-12";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		//associa o cliente paulo a conta contaDo Paulo; 
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
	}

}
