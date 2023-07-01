package br.com.bytebanck.banco.modelo;
import br.com.bytebanck.banco.modelo.*;

public class CalcularImposto  {

	private double totalImposto;
	
	public void registra(Tributavel t) {;
	double valor = t.getValorImposto();
	this.totalImposto += valor;
	
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}