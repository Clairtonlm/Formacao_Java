package br.com.bytebanck.banco.util;

import java.util.ArrayList;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 12);
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe: " + existe);
		
		for(Conta conta : lista) {
			if(conta.ehIgual(cc3)) {
				System.out.println("Já tenho essa referencia!");
			}
		}
		
		
		for(Object conta : lista) {
			System.out.println(conta);
		}
	}

}
