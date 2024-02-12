package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class DataHora1 {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;;
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //considerando a hora do computador local do usuario
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//veja a documentação para lembrar
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Texto ISO 8601 - para Data hora(passando data e hora)
        LocalDate d04 = LocalDate.parse("11/03/2024", fmt1);
        LocalDateTime d05 = LocalDateTime.parse("11/03/2024 01:30", fmt2);

        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//la em Londres
        Instant d10 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d06 = LocalDate.of(2024,11, 02);

        //FORMATAÇÃO

        //DATA-HORA -> TEXTO ISO 8601

        // DATA-HORA -> TEXTO CUSTOMIZADO

        System.out.println(d01.toString());
        System.out.println(d02);
        System.out.println(d03);
        //DATA-HORA -> TEXTO ISO 8601
        System.out.println("Usando Formato " + d04.format(fmt1));
        System.out.println("Usando Formato " + fmt1.format(d04));
        System.out.println("Usando Formato " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(d05);
        System.out.println("Usando ISO_DATA_TIME " + d05.format(fmt4));
        System.out.println(d06);
        System.out.println("Essa hora é la em Londres " + d07.toString());
        System.out.println("Instatnt " + fmt3.format(d10));
        System.out.println("Instatnt " + fmt5.format(d10));
    }

}
