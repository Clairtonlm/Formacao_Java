package datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoComDataHora {
    public static void main(String[] args) {
        System.out.println("----------Calculo com data hora----------");
        LocalDate diaAtual = LocalDate.now();
        LocalDate d01 = LocalDate.parse("2024-02-11");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-11T12:00");
        //Instante da hora Global
        Instant d03 = Instant.parse("2024-02-11T12:00:00Z");

        LocalDate semanaPassada = diaAtual.minusDays(7);
        LocalDate proximaSemana = d01.plusDays(7);
        System.out.println(semanaPassada);
        System.out.println(proximaSemana);

        LocalDateTime tempoSemanaPassada = d02.minusDays(7);
        LocalDateTime tempoProximaSEmana = d02.plusDays(7);
        System.out.println(tempoSemanaPassada);
        System.out.println(tempoProximaSEmana);

        Instant x = d03.minus(7, ChronoUnit.DAYS);
        Instant y = d03.plus(7, ChronoUnit.DAYS);
        System.out.println(x);
        System.out.println(y);

        //Duração entre datas
        Duration to = Duration.between(d01.atTime(0,0),diaAtual.atTime(0,0));
        Duration to1 = Duration.between(d01.atStartOfDay(),diaAtual.atStartOfDay());
        Duration t1 = Duration.between(tempoSemanaPassada,d02);
        System.out.println(to);
        System.out.println("Se passarm: " + t1.toDays() + " Dias");
        System.out.println(to1);

    }
}
