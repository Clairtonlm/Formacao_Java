package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(22, 15);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElemento();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());

	}

}
