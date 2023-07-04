package br.com.alura.bytebanck;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

//br.com.alura.bytebanck.TesteBiblioteca
public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 002);
		c.deposita(100);
		
		System.out.println(c.getSaldo());
	}

}
