package Coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Java");
		livros.push("O Hobbit");
		livros.push("Don Quixote");
		
		//System.out.println(livros.peek());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
	

	}
}
