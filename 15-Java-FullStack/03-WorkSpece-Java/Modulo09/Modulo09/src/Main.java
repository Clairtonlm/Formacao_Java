package Modulo09.Modulo09.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aluno 01");
        Aluno95 aluno1 = new Aluno95();// Aqui é joão
        aluno1.nome = "João";

        System.out.println("Aluno 02");
        Aluno95 aluno2 = new Aluno95();// Aqui é o pedro

        System.out.println("Aluno 03");
        Aluno95 aluno3 = new Aluno95();// Aqui é Zayron

        System.out.println("Aluno 04");
        Aluno95 aluno4 = new Aluno95("Zika");

        System.out.println("Aluno 05");
        Aluno95 aluno5 = new Aluno95("Maria", 23);

        System.out.println(aluno1.nome);
    }


}
