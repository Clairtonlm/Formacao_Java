package br.com.bytebanck.banco.util;

import java.util.ArrayList;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Object ref = (Conta) lista.get(0);
		System.out.println(((Conta) ref).getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 13);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44, 14);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
