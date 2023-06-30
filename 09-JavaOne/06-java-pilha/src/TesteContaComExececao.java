
public class TesteContaComExececao {

	public static void main(String[] args)throws MinhaExcecao2  {
		Conta c = new Conta();
		//Aqui ele sabe que tem uma excecao. tem que tratar
		//1- usar Throws na main -> ai quem chmar que ajeita
		//2 - Faz um try/catch- e faz o tratamento
		c.deposita();
		
		Conta c1 = new Conta();
		try{
			c1.deposita();

		}catch(MinhaExcecao2 ex) {
			
		}
	}

}
