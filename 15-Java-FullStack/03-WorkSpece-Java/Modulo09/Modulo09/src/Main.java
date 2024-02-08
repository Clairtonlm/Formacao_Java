package Modulo09.Modulo09.src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------Aluno 01--------");

        String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno:");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno: ");
        String cpf = JOptionPane.showInputDialog("Qual a CPF do aluno: ");

        Aluno95 aluno1 = new Aluno95();// Aqui é joão

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setCpf(cpf);

        aluno1.setNota1(9.2);
        aluno1.setNota2(7.8);
        aluno1.setNota3(8.9);
        aluno1.setNota4(9.5);

        System.out.println("O nome do Aluno 01 é " + aluno1.getNome());
        System.out.println("A idade  do Aluno 01 é " + aluno1.getIdade());
        System.out.println("A data de nascimento do Aluno 01 é " + aluno1.getDataNascimento());
        System.out.println("O CPF do Aluno 01 é " + aluno1.getCpf());
        System.out.println("A média do Aluno é = " + aluno1.mediaAluno());

        System.out.println("Resultado do aluno = " + (aluno1.verificaAprovacao() ? "APROVADO" : "REPROVADO"));
        //System.out.println("O aluno está " + aluno1.verificaAprovacao2());

        System.out.println();
        System.out.println("--------Aluno 02--------");
        Aluno95 aluno2 = new Aluno95();// Aqui é o pedro



        System.out.println("--------Aluno 03--------");
        Aluno95 aluno3 = new Aluno95();// Aqui é Zayron

        System.out.println("--------Aluno 04--------");
        Aluno95 aluno4 = new Aluno95("Zika");

        System.out.println("--------Aluno 05--------");
        Aluno95 aluno5 = new Aluno95("Maria", 23);


    }


}
