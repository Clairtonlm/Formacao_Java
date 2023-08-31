package loops;

public class Loops {

	public static void main(String[] args) {
		int cont = 0;
		int max = 10;
		System.out.println("Contando até " + max);
		
		while(cont <= max) {
			System.out.println("Valor de cont : " + cont);
			cont++;
		}
		
		do {
			cont++;
			System.out.println(" Valor de cont: " + cont);
		}while(cont < 15);
		System.out.println(cont);
	}

}
