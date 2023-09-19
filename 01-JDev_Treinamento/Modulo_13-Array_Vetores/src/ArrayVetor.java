
public class ArrayVetor {
	 
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos */
		/* Array deve ter a quantidade de posições definidas*/
		
		double[] notas = new double[4];
		
		notas[0]=8.8;
		notas[1]=7.6;
		notas[2]=8.7;
		notas[3]=9.9;
		
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
		
		
		
		
		
	}//main
}//classe
