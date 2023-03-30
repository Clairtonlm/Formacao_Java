package classesauxiliares;

import escola_dev.PermitirAcesso;

//So para receber o contrato de acesso da interface
public class FuncaoAutenticacao {
	
	public boolean autenticarPessoa(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
	
}
