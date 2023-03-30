package execao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		gerarErro1();
		
		try {
			gerarErro2();
		} catch (Throwable e) {
			System.out.println("erro2 tratado" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}
	static void gerarErro1() {
		throw new RuntimeException("Erro bem legal. throw gera um erro #01");
	}
	static void gerarErro2() throws Exception {
		throw new Exception("Erro2");
	}

}//fim class
