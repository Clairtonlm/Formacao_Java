import javax.swing.JOptionPane;

public class ArrayVetor2 {
	 
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos */
		/* Array deve ter a quantidade de posições definidas*/
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter");
				
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + (pos + 1));
			notas[pos] = Double.valueOf(valor);
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
		
		
	}
}
