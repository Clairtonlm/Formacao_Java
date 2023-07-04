package br.com.bytebanck.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Curso_Java";
		String vazio = "";
		String vz = vazio.trim();
		System.out.println(vz);
		System.out.println(vazio.isEmpty());
		
		System.out.println(nome.length());
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		int posicao = nome.indexOf("ur");
		System.out.println(posicao);
		
		String sub = nome.substring(3);
		System.out.println(sub);
		
		
		String outranome= nome.replace("C", "c");
		String outro = nome.toUpperCase();
		//nome.toLowerCase();
		System.out.println(outranome);
		System.out.println(outro);
		
		char c = nome.charAt(2);
		System.out.println("eu estou na posição " + c);

	}

}
