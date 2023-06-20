
public class TesteFuncionario {
//nico=ziru
	public static void main(String[] args) {
		Funcionario ziru = new Gerente();
		ziru.setNome("Ziru Java");
		ziru.setCpf("002.003.004-45");
		ziru.setSalario(2500);
		
		System.out.println(" O meu nome é: " + ziru.getNome());
		System.out.println(ziru.getBonificacao());
		
	}

}
