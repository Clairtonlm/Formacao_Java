package escola_dev;

import java.util.Scanner;

import javax.swing.JOptionPane;

import classesauxiliares.FuncaoAutenticacao;

public class TelaLogin {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Digite seu login");
		String login = input.next();
		System.out.println("Digite seu senha");
		String senha = input.next();*/
		String login = JOptionPane.showInputDialog("Informe seu login de usuário");
		String senha = JOptionPane.showInputDialog("Informe a senha de usuário");
		
		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		
		
		//PermitirAcesso secretario = new Secretario();//diretamente com o objeto
		/*  secretario.setLogin(login);
		    secretario.setSenha(senha); 
		*/
		
		if(new Secretario().autenticar(login, senha)) {
			//System.out.println("Acesso com sucesso ao sistema");
			JOptionPane.showInternalMessageDialog(null, "Acesso Permitido com sucesso!!!");
		}else {
			JOptionPane.showMessageDialog(null, "Acesso negado. Consulte o administrador do sitema");
		}
		
	}

}
