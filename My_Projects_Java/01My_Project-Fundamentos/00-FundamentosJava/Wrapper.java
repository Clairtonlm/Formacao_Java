package praticando;

public class Wrapper {

	public static void main(String[] args) {
		//Wrapper esse tipo inicia com letra maiuscula
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");//parseInt transforma string em inteiro
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(i);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());//toString para  boolean  
		
		
		Character c = '#';//char
		System.out.println(c + "...");
		
		Float f = 123.04f;
		System.out.println(f);
		
		Double d = 1234.3456d;
		System.out.println(d);
		
		
		
	}

}
