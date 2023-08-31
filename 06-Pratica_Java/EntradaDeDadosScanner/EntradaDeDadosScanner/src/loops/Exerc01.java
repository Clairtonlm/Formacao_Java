package loops;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean  infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Ente com nome de usuário");
			nomeUser = scan.next();
			
			System.out.println("Entre com senha");
			senha = scan.next();
			
			 if(nomeUser.equalsIgnoreCase(senha)) {
				 //infoValidas = false;
				 System.out.println("Senha igual ao usuario, digite novemente");
			 }else {
				 infoValidas = true;
				 System.out.println("Senha valida");
			 }
			
		}
		while(!infoValidas);
	}//main
		
	

}
