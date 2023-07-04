package br.com.alura.bytebanck;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 002);
		c.deposita(100);
		
		System.out.println(c.getSaldo());
	}

}
