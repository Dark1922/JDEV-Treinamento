package ModuloData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava6 {
  public static void main(String[] args) {

    LocalDate localDate = LocalDate.now(); //pega data atual
    System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    System.out.println("Dia da semana: " + localDate.getDayOfWeek()); //nome do dia da semana
    System.out.println("Dia do mes: " + localDate.getDayOfMonth()); //dia do mes
    System.out.println("Dia do ano: " + localDate.getDayOfYear());//dia do ano que estamos
    System.out.println("Nome do mês: " + localDate.getMonth() + " Número do mês: " + localDate.getMonthValue());
    System.out.println("No ano de: " + localDate.getYear());//ano
  }
}
