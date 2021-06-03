package ModuloData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava10 {
  public static void main(String[] args) {

    LocalDate dataBase = LocalDate.parse("2021-06-02");

    for (int mes = 1; mes <= 12; mes ++) {
          dataBase = dataBase.plusMonths(1);

      System.out.println("Data de vencimento do boleto: "
            + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            + " da parcela " + mes);
    }


  }


}
