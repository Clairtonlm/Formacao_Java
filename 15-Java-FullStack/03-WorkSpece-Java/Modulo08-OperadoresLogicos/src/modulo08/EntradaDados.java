package modulo08;

import javax.swing.*;

public class EntradaDados {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        System.out.println(nome);
        String carro = JOptionPane.showInputDialog("quantos carros");
        System.out.println(carro);
        String pessoa = JOptionPane.showInputDialog("quantas pessoas");
        System.out.println(pessoa);

        //converter esses dados string em double
        double carroNumero = Double.parseDouble(carro);
        double pessoaNumero = Double.parseDouble(pessoa);

        // converto double em inteiro na divisão
        int divisao = (int)(carroNumero / pessoaNumero);
        System.out.println(divisao);
        double resto = carroNumero % pessoaNumero;

       int res = JOptionPane.showConfirmDialog(null, "Quer o resultado da divsão");
       if(res == 0){
          JOptionPane.showMessageDialog(null,"A divisão foi de " + divisao + " E resto de " + resto);
       }
        System.out.println(resto);
    }
}
