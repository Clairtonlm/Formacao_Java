
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Admintrador adm = new Admintrador();
		adm.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2229);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);

	}

}
