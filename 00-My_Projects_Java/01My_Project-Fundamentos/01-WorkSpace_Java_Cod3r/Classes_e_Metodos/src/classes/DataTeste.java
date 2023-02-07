package classes;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		//d1.dia = 29;
		//d1.mes = 06;
		//d1.ano = 2023;
		
		System.out.printf("%d/ %d /%d\n", d1.dia, d1.mes, d1.ano);
		
		 var d2 = new Data(30, 11, 2022);
		 
		 //d2.dia = 28;
		 //d2.mes = 10;
		 //d2.ano = 2017;
		 
		 String dataFormatada = d1.obterDataFormatada();
		 
		 System.out.println(dataFormatada);
		 System.out.printf(d2.obterDataFormatada());
		 
	}

}
