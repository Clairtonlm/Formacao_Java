package br.com.bytebanck.banco.util;

import java.util.ArrayList;
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

	}

}
