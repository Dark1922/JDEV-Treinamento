package ModuloData;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DataEmJava7 {
  public static void main(String[] args) throws ParseException, InterruptedException {

    Instant inicio = Instant.now();

    Thread.sleep(2000);//pode ser um processo com tempo qualquer

    Instant ifinal = Instant.now();
    Duration duracao = Duration.between(inicio, ifinal);//duração entre o inicio e final

    System.out.println("Duraçãoo em nanos segundos: " + duracao.toNanos());
    System.out.println("Duraçãoo em minutos: " + duracao.toMinutes());
    System.out.println("Duraçãoo em horas: " + duracao.toHours());
    System.out.println("Duraçãoo em mili segundos " + duracao.toMillis());
    System.out.println("Duraçãoo em dias: " + duracao.toDays());
  }
}
