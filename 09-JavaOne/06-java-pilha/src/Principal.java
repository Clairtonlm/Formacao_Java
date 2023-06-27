
public class Principal {

	public static void main(String[] args) {
		String nome = "Dev";
		System.out.println("ANTES");
		
		try {
			System.out.println(nome);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("CATCH");
		}
		System.out.println("DEPOIS");
	}

}
