package padrao;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        String[][] notasString = {
            {"1234", "7.5", "8.2", "9.0", "B"},
            // ... (os demais dados)
            {"2467", "6.7", "7.2", "7.5", "B"}
        };

        // A: 10, B: 9, C: 7, D: 6, E: 4, F: 2
        double mediaTurma = 0;
        int countAlunos = 0;

        for (String[] aluno : notasString) {
            double mediaAluno = calcularMediaAluno(aluno);
            mediaTurma += mediaAluno;
            countAlunos++;
        }

        if (countAlunos > 0) {
            mediaTurma /= countAlunos;
        }

        System.out.println("A média da turma é: " + mediaTurma);
    }

    public static double calcularMediaAluno(String[] aluno) {
        double somaNotas = 0;
        int contadorNotas = 0;

        for (int i = 1; i < aluno.length - 1; i++) { // Começa em 1 para pular o ID do aluno
            double nota = Double.parseDouble(aluno[i]);
            int peso = obterPesoNota(aluno[aluno.length - 1].charAt(0)); // Último elemento contém a letra da nota
            somaNotas += (nota * peso);
            contadorNotas += peso;
        }

        if (contadorNotas > 0) {
            return somaNotas / contadorNotas;
        } else {
            return 0;
        }
    }

    public static int obterPesoNota(char letraNota) {
        switch (letraNota) {
            case 'A':
                return 10;
            case 'B':
                return 9;
            case 'C':
                return 7;
            case 'D':
                return 6;
            case 'E':
                return 4;
            case 'F':
                return 2;
            default:
                return 0;
        }
    }
}

