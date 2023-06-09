package fundamentos;

public class Condicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		System.out.println("-----------------------------");
		
		int idade = 10;
		int quantidadePessoa = 3;
		if(idade >=18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}else {
			if(quantidadePessoa >=2) {
				System.out.println("Voce nao tem 18 anos, mas pode entar" + 
			" Pois estar acompanhado");
			}else{
			System.out.println(" Você nao tem mais de 18 anos");
			System.out.println(" Não pode entrar");
			}
		}
		
	}

}
