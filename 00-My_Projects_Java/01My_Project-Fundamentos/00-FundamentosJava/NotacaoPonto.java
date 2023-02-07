package praticando;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X","Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "clairton".toUpperCase();
		System.out.println(x);
		
		// tipo primitivos nao tem a notação ponto "."
		//posso quebrar ou antes do ponto ou depois do ponto
		//ou mater todo conmando tudo na mesma linnha

	}

}
