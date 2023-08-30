package tech.clairton.entrada;

import javax.swing.JOptionPane;

public class EntradaDados {
    public static void main(String[] args) {
        int idade;

    idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
    JOptionPane.showMessageDialog(null,"A pessoa tem " + idade + " anos de idade");
    
    }
    
}