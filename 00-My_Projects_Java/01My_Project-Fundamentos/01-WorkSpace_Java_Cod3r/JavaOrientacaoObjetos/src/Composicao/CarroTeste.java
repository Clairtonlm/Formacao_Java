package Composicao;

public class CarroTeste {

	
		public static void main(String[] args) {
			
			Carro c1 = new Carro();
			System.out.println(c1.estarLigado());
			
			c1.ligar();
			System.out.println(c1.estarLigado());
			
			System.out.println(c1.motor.giros());
			
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
			System.out.println(c1.motor.giros());
			
			c1.frear();
			c1.frear();
			c1.frear();
			c1.frear();
	}

}
