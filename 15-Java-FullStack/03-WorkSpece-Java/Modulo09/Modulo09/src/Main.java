package Modulo09.Modulo09.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aluno 01");
        Aluno95 aluno1 = new Aluno95();// Aqui é joão
        aluno1.setNome("João");
        aluno1.setIdade(52);
        aluno1.setDataNascimento("10/02/2025");
        aluno1.setCpf("002.005.003-04");
        aluno1.setNota1(9.2);
        aluno1.setNota2(7.8);
        aluno1.setNota3(8.9);
        aluno1.setNota4(9.5);


        System.out.println("Aluno 02");
        Aluno95 aluno2 = new Aluno95();// Aqui é o pedro



        System.out.println("Aluno 03");
        Aluno95 aluno3 = new Aluno95();// Aqui é Zayron

        System.out.println("Aluno 04");
        Aluno95 aluno4 = new Aluno95("Zika");

        System.out.println("Aluno 05");
        Aluno95 aluno5 = new Aluno95("Maria", 23);

        System.out.println("O nome do Aluno 01 é " + aluno1.getNome());
        System.out.println("A média do da nota é = " + aluno1.mediaAluno());
    }


}
