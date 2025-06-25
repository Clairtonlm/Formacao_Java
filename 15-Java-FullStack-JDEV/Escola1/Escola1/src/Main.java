public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");

        Aluno aluno2 = new Aluno("ClairtonLIma");
        System.out.println(aluno2.getNome());
        System.out.println(aluno1.toString());
        
    }
}