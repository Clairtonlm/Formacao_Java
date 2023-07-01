package br.com.bytebanck.banco.teste;
import br.com.bytebanck.banco.modelo.*;
public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 1070);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalcularImposto calc = new CalcularImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
