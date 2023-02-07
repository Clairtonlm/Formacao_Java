package Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Maria");
		fila.offer("Clairton");
		fila.offer("Dev");
				
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.isEmpty());//boleano-->saber se a fila estar ou nao vazia
		
		//os dois metodos remove o elemento
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}

}
