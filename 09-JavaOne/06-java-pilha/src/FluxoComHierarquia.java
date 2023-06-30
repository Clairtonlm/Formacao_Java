
public class FluxoComHierarquia {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		}catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
	private static void metodo1() throws MinhaExcecao2 {
		System.out.println("Ini do metodo1");
			metodo2();
		System.out.println("Fim do medoto1");
	}
	private static void metodo2() throws MinhaExcecao2 {
		System.out.println("Ini do metodo2");
		
		//criando objeto 
		throw new MinhaExcecao2("Deu errado");
		
		
		//System.out.println("Fim do medoto2");
	}
	
}
