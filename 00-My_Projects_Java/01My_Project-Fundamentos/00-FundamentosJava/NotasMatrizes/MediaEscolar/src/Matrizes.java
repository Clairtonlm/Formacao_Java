import javax.swing.JOptionPane;

public class Matrizes {
    public static void main(String[] args) {
        /*
         * Escreva um algoritimo que solicite ao usuario a entrada de 4 notas
         * para cada aluno, calcular a media dos alunos e xebir em tela;
         * Ao final mostra a media da turma;
         * ao lado da media do aluno deve segiir a seguinte regra:
         * se media >= 7.5 aluno aprovado;
         * Se media >= 5.5 e < 7.5 Aluno de recuperação
         * Se media < 5.5 alno reprovado
         */
        // vertor de Alunos:
        String [] alunos = {"Clairton", "Mell", " Fabiane"};

        //Matriz notas
        float [][] notas = new float [3] [4];

        //para calcular o somatorio das notas de cada aluno
        //para calcular a media do aluno
        float somaNotas, mediaAluno;

        //para armazenar o status do aluno e usar para imprimir o boletim
        String statusAluno;

        //informar as notas dos alunos
        //laço externo para associar aluno a nota
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno : " + alunos[i]);
            //laço interno para informar as notas de cada aluno
            somaNotas = 0;
            mediaAluno = 0;
            for (int j = 0; j < 4; j++) {
                notas [i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota n° " +(j + 1) + " do(a) Aluno(a) " +  alunos[i]));
            }
            mediaAluno = (somaNotas / 4);
            if(mediaAluno < 5.5){
                statusAluno = "Reprovado";
            } else if(mediaAluno >= 5.5 && mediaAluno <= 7.5){
                statusAluno = "EM RECUPERAÇÃO";
            } else {
                statusAluno = " APROVADO";
            }
            //IMPRESSÃO DO BOLETIM
            System.out.println("\n*******************BOLETIM****************");
            System.out.println("Aluno.: " +alunos[i]);
            System.out.println("Notas");
            for (int j2 = 0; j2 < 4; j2++) {
                System.out.println((j2 + 1) + " - " + notas[i][j2]);
                
            }
            System.out.println("Média ..: " + mediaAluno + " - " + statusAluno);
        }
    }
}
