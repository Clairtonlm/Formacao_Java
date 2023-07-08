
public class ArrayVetor {
	 
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos */
		/* Array deve ter a quantidade de posições definidas*/
		
		double[] notas = new double[5];
		
		
		notas[1]=7.6;
		notas[2]=8.7;
		notas[3]=9.9;
		
		for(int pos = 1; pos < 5; pos++) {
			System.out.println("Nota " + pos + " é = " + notas[pos]);
		}
	}
}
