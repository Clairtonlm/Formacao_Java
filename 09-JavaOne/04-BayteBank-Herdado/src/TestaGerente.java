
public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Ray sacarose");
		g1.setCpf("005.007.009-67");
		g1.setSalario(1000.0);
		
		g1.imprimir();
		boolean autentica = g1.autentica(1345);
		System.out.println(autentica);
		g1.getBonificacao();

	}

}
