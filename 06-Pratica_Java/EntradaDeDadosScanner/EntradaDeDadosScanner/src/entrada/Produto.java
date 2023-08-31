package entrada;

import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {
		String valorProduto = JOptionPane.showInputDialog("Digite um valor");
		int valorProduto1 = Integer.parseInt(valorProduto);
		if(valorProduto1 <= 10) {
			JOptionPane.showMessageDialog(null, "Ta bom ");
		}else if(valorProduto1 >= 20) {
			JOptionPane.showMessageDialog(null, "Ta ruim ");

	}

}
}
