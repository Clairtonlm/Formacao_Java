package modulo08;

import javax.swing.*;

public class MediaAlunos813 {
    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
        String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
        String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
        String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

        //convertendo para numeros
        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
        if(media >=5){

            if(media >= 7){
                JOptionPane.showMessageDialog(null, "A média é " + media + " Aprovado");
            }else {
                JOptionPane.showMessageDialog(null, "A média é " + media + " Recuperação");
            }
        }else {
            JOptionPane.showMessageDialog(null, "A média é " + media + "Reprovado");
        }


    }
}
