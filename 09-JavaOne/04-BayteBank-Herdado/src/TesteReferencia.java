
public class TesteReferencia {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Noah Lima");
		g1.setSalario(5000);
		
		Funcionario f = new Gerente();
		f.setNome("João");
		f.setSalario(2000);
		f.imprimir();
		
		g1.imprimir();
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		
		Designer d = new Designer();
		d.setNome("Fabi");
		d.setSalario(3000);
		controle.registra(d);
		d.imprimir();
		
		System.out.println(controle.getSoma());

	}

}
