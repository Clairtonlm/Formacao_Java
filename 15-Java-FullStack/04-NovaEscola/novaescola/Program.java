package novaescola;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("--------Aluno 01 NE--------");
        List<AlunoNE> alunos = new ArrayList<>();

        AlunoNE aluno1 = new AlunoNE();

        for (int qtd = 0; qtd <= 1; qtd++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
            String matricula = JOptionPane.showInputDialog("Qual a número da Matrícula do aluno:");
            //String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno: ");
            //String cpf = JOptionPane.showInputDialog("Qual a CPF do aluno: ");

            //aluno1 = new AlunoNE();

            aluno1.setNome(nome);
            aluno1.setMatricula(Integer.valueOf(matricula));
            //aluno1.setDataNascimento(dataNascimento);
            //aluno1.setCpf(cpf);

            for (int pos = 1; pos <= 2; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + pos + " ?");
                String notaDisciplina = JOptionPane.showInputDialog("Digite a nota " + pos + " ?");

                Disciplina disciplina = new Disciplina();

                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.parseDouble(notaDisciplina));


                aluno1.getDisciplinas().add(disciplina);

            }
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

            if (escolha == 0) {//Yes
                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina remover ? 1, 2, 3 ou 4 ");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
                }
            }
        }
        //Impressão de dados
        System.out.println();
        System.out.println(aluno1.toString());
        System.out.println();
        System.out.println(aluno1.verificaAprovacao2());
        System.out.println();

        System.out.println();
        System.out.println("_______FIM_______");
    }
}
