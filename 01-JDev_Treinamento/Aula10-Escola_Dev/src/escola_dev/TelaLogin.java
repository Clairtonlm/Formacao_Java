package escola_dev;

import java.util.Scanner;

public class TelaLogin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu login");
		String login = input.next();
		System.out.println("Digite seu senha");
		String senha = input.next();
		
		
		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if(secretario.autenticar()) {
			System.out.println("Acesso com sucesso ao sistema");
		}else {
			System.out.println("Acesso não permitido");
		}
		
	}

}
