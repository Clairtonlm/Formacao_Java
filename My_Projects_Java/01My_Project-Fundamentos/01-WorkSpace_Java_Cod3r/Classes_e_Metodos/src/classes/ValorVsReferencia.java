package classes;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a + " \n" + b);
		
		Data d1 = new Data(1, 6, 2022);
		
		Data d2 = d1;
		
		d1.dia = 25;
		d2.mes = 06;
		d1.ano = 2025;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}

}
