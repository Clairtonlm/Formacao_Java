package br.com.bytebanck.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idade = new int[5];
		
		String[] nomes = new String[6];
		
		int age = 29;
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(age);//Autoboxing-> transformação de primitivo em objeto
		
		System.out.println(numeros);
	}

}
