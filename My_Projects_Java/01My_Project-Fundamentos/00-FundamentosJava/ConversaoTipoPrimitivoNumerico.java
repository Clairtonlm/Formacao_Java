package praticando;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		//cast
		float b = (float) 1.234;//CAST usa () e dentro dele coloca o valor primitivo
		System.out.println(b);
		
		int c = 4;
		byte d =(byte) c;
		System.out.println(d);
	}

}
