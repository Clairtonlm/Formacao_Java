package novaescola;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("--------Aluno 01 NE--------");

        AlunoNE aluno1 = new AlunoNE();

        String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
        String matricula = JOptionPane.showInputDialog("Qual a número da Matrícula do aluno:");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno: ");
        String cpf = JOptionPane.showInputDialog("Qual a CPF do aluno: ");

        aluno1.setNome(nome);
        aluno1.setMatricula(Integer.valueOf(matricula));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setCpf(cpf);

        Disciplina disciplina1 = new Disciplina();

        disciplina1.setDisciplina("JAVA");
        disciplina1.setNota(10);

        aluno1.getDisciplinas().add(disciplina1);





        System.out.println();
        System.out.println("_______FIM_______");
    }
}
