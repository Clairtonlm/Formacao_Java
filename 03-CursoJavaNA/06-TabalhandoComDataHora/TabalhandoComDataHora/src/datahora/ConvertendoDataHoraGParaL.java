package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class ConvertendoDataHoraGParaL {
    public static void main(String[] args) {
        /* Convertendo dta-hora Global para Local tem que informar:
        * Data-hora global, timezone(Sistema Local) -> Data-hora local
        *
        * Obter dados de uma data-hora local
        *Data-hora local -> dia, mes, anos, horarrio
        * Calculos com data hora
        * data-hora +/- tempo -> data-hora
        * Data-hora 1, data-hora 2-> duração
        *
        */
        System.out.println("----------data hora----------");

        LocalDate d01 = LocalDate.parse("2024-02-11");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-11T12:00");

        //Instante da hora Global
        Instant d03 = Instant.parse("2024-02-11T12:00:00Z");

        //Pagar uma hora Global e transformar parta Local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Europe/Lisbon"));

        //Obter dados de uma data-hora local
        System.out.println("Obter dados de uma data-hora local");
        System.out.println("D01 dia: " + d01.getDayOfMonth());
        System.out.println("D01 mes: " + d01.getMonthValue());

        System.out.println();
        System.out.println("D01 Estado: " + d01.getEra());
        System.out.println(r1);
        System.out.println(r2);
    }
}
