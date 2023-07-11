import javax.swing.JOptionPane;

public class ArrayVetor3 {
	 
	public static void main(String[] args) {
		
		double[] valores = {9.8,5.1,8.3};
		for(int pos = 0; pos < valores.length; pos++) {
			System.out.println("Os valores na posição " + pos +" é igual a = " + valores[pos]);
		}
		System.out.println("-------------------------");
		String[] nomes = new String[4];
		nomes[0]="Clairton";
		nomes[1]= "00.003-05";
		nomes[2]="Curso Java";
		nomes[3]="contato@gmail.com";
		for(int i = 0; i < nomes.length;i++) {
			System.out.println(nomes[i]);
		}
		System.out.println("-------------------------");
		String[] nomes2 = {"nome: Clairton Lima",
				"CPF:00.005.006-06",
				"Curso: Curso em Java",
				"Contato: contato@gmail.com"
				
		};
		for(int i = 0; i < nomes2.length;i++) {
			System.out.println( i + " é igual " + nomes2[i]);
		}
		
	}//fim main
}//fim da classe
