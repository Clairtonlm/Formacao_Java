package heranca;

public class CarroTestte {

	public static void main(String[] args) {
		Carro c1 = new Civic();
		System.out.println("==========Civic=======================");
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		System.out.println("===========Ferrari====================");
		
		Ferrari c2 = new Ferrari();
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		c2.frear();
		System.out.println(c2);


	}

}
