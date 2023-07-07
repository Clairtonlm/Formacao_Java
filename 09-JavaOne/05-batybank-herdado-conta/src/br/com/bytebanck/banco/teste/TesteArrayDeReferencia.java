package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencia {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(1007, 302011);
		contas[0] = cc1;
		System.out.println(cc1.getNumero());
		
		ContaCorrente cc2 = new ContaCorrente(200, 302010);
		contas[1] = cc2;
		//System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[0];
		ContaCorrente ref2 = contas[1];
		
		System.out.println(ref.getAgencia());
		System.out.println(ref2.getAgencia());
	
	}

}
