package polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		// aqui se instancia os objetos
		Pessoa convidado = new Pessoa(95.00);
		
		Arroz ingrediente1 = new Arroz(1.50);
		Feijao ingrediente2 = new Feijao(1.50);
		Sorvete ingrediente3 = new Sorvete(1.00);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente3);
		System.out.println(convidado.getPeso());
		
	}

}
