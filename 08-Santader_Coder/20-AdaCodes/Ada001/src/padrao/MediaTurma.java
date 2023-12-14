package padrao;
/*
 * Escreva um programa em Java que solicita ao usuário o número de alunos em uma turma.
 *  Para cada aluno, o programa deve solicitar suas notas em três provas e calcular a média. 
 * No final, o programa deve imprimir a média da turma.
 * 
 * */
import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int numeroAlunos = scanner.nextInt();

        double somaMedias = 0.0;

        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.println("\nAluno #" + i);
            double somaNotas = 0.0;

            for (int j = 1; j <= 3; j++) {
                System.out.print("Digite a nota da prova " + j + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double mediaAluno = somaNotas / 3;
            System.out.println("Média do aluno #" + i + ": " + mediaAluno);
            somaMedias += mediaAluno;
        }

        double mediaTurma = somaMedias / numeroAlunos;
        System.out.println("\nMédia da turma: " + mediaTurma);

        scanner.close();
    }
}
