package ModuloData;

import java.text.ParseException;
import java.time.LocalDate;

public class DataEmJava9 {
  public static void main(String[] args) throws ParseException {

    LocalDate dataBase = LocalDate.parse("2021-06-02");

    System.out.println(dataBase);//data normal
    System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));//data adicionando + 5 dias
    System.out.println("Mais 5 semans: " + (dataBase = dataBase.plusWeeks(5)));
    System.out.println("Mais 5 meses: " + (dataBase = dataBase.plusMonths(5)));
    System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
    System.out.println("Menos 1 anos: " + (dataBase = dataBase.minusYears(1)));
    System.out.println("Menos 1 mes: " + (dataBase = dataBase.minusMonths(1)));
    System.out.println("Menos 1 dia: " + (dataBase = dataBase.minusDays(1)));
    System.out.println("Menos 1 semana: " + (dataBase = dataBase.minusWeeks(1)));


  }
}
