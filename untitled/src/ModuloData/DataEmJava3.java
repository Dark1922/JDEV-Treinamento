package ModuloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataEmJava3 {
  public static void main(String[] args) throws ParseException {

    //consegue saber o perido entre as  datas
   long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-04-01"), LocalDate.now());
   System.out.println("Possui " + dias + " dias entre a faixa de data");
  }
}
