package br.com.bytebanck.banco.teste;

public class TesteArray {

	public static void main(String[] args) {
		int[] idades = new int[10];
		
		for(int i = 0; i < idades.length; i++) {
			idades[i]= i * i;
			System.out.println(idades[i]);
		}
	}

}
