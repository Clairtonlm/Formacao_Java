package br.com.bytebanck.banco.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22,33);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaCorrente(22,44);
		cc1.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22,11);
		cc1.deposita(111.0);

		Conta cc4 = new ContaCorrente(22,22);
		cc1.deposita(222.0);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		//5- fazer um laço antes da comparação
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		//3- instancia a classe
		NumeroDaContaComparator comparador = new NumeroDaContaComparator();
		lista.sort(comparador);
		System.out.println("-----------------------------");
		
		//6- fazer um laço depois da comparação
				for (Conta conta : lista) {
					System.out.println(conta);
				}
		
		//4-passa para o metodo de ordenação da lista
		

	}

}
//1-cria a classe com implementes
class NumeroDaContaComparator implements Comparator<Conta>{

	//2-faz o criterio do metodo
	@Override
	public int compare(Conta c1, Conta c2) {
		if(c1.getNumero() < c2.getNumero()) {
			return -1;//qual coisa aqui
		}
		if(c1.getNumero() > c2.getNumero()) {
			return 1;//qualquer coisa
		}
		return 0;
	}
	
}
