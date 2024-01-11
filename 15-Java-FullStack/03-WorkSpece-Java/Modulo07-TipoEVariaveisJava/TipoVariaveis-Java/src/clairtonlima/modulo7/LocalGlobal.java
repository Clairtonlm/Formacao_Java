package clairtonlima.modulo7;

public class LocalGlobal {

	//variavel global
	static int variavelGlobal = 12;
	
	public static void main(String[] args) {
		int variavelLocal = 12;
		System.out.println("Valor variável local: " + variavelLocal);
		metodo2();
	}

	//fora do metodo main
	public static void metodo2() {
		
		System.out.println(variavelGlobal);
	}
}
