package execao;

public class Basico {

	public static void main(String[] args) {
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			System.out.println("Nao exite divisao por zero" + e.getMessage());
			e.printStackTrace();
		}

	}

}
