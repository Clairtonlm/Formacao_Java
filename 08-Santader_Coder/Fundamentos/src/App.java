import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class App {
    public static void main(String[] args) throws Exception {
       //olá, {nomeDaPessoa}. Hoj é dia {diaDaSemana}, BOM DIA!!!

       String nomeDaPessoa = "Clairton";
       String nome = "ClaiRtoN";

       System.out.println(nomeDaPessoa.toUpperCase());
       System.out.println(nomeDaPessoa.toLowerCase());
       System.out.println(nomeDaPessoa.length());
       System.out.println(nome.equalsIgnoreCase(nomeDaPessoa));
       
       //iso 8601
       LocalDate hoje = LocalDate.now();
      

       Locale brasil = new Locale("pt","BR" );
       System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

       String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

       String saudacao;
       LocalDateTime agora = LocalDateTime.now();
       if(agora.getHour() >= 0 && agora.getHour() <12){
        saudacao = "Bom dia!";
       }else if(agora.getHour() >=12 &&  agora.getHour() < 18){
        saudacao = " Boa tarde";
       }else if(agora.getHour() >= 18 &&  agora.getHour() < 24){
        saudacao = " Boa noite";
       }else{
        saudacao = "Olá.";
       }
     
    System.out.printf("Ola, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());
    }
}