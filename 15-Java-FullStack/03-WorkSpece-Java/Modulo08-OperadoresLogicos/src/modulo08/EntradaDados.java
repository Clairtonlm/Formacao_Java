package modulo08;

import javax.swing.*;

public class EntradaDados {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        System.out.println(nome);
        String idade = JOptionPane.showInputDialog("Qual a sua idade");
        System.out.println(idade);

        //converter esses dados
        double idadeNumero = Double.parseDouble(idade);
    }
}
