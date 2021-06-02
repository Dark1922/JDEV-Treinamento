package ModuloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataEmJava5 {
  public static void main(String[] args) throws ParseException {

    //api com datas / Nova API DE DATA aparti do java8
    LocalDate dataAtual = LocalDate.now(); //temos a data atual aqui

    System.out.println("Data Atual: " + dataAtual);

    LocalTime horaAtual = LocalTime.now(); //hora de agora

    System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

    LocalDateTime dataAutalHoraAtual = LocalDateTime.now();

    System.out.println("Hora e data atual: " + dataAutalHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
  }
}
