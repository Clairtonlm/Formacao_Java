package br.com.bytebanck.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
		int idade = 89;
		Integer idadeRef = Integer.valueOf(89);//autoboxing
		System.out.println(idadeRef.doubleValue());//unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());//para pegar o primitivo
		
		Number numero = Integer.valueOf(99);
		
		List<Number> lista = new ArrayList<>();
		lista.add(100);
		lista.add(89.1);
		System.out.println(lista);
	}

}
