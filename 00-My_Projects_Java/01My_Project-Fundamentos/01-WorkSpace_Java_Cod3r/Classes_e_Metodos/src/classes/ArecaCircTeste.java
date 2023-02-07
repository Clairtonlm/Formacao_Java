package classes;

public class ArecaCircTeste {

	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
		System.out.println(a.area());
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10;
		AreaCirc.pi = 1000;
		System.out.println(a1.area());
	}

}
