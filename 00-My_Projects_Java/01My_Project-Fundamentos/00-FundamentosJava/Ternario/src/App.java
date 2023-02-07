import org.w3c.dom.stylesheets.MediaList;

public class App {
    public static void main(String[] args) throws Exception {
        double media = 4.0; 

        String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";
        String resultadoFinal   = media >= 7.0 ? " Aprovado" : resultadoParcial;

        System.out.println(" O Aluno estar " + resultadoFinal);
    }
}
