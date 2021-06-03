package ModuloData;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DataEmJava8 {
  public static void main(String[] args) throws ParseException {

    LocalDate dataAntiga = LocalDate.parse("2020-02-07");//uma data antiga

    LocalDate dataNova = LocalDate.parse("2021-07-21");//uma data nova

    System.out.println("data antiga e maior que data nova: " + dataAntiga.isAfter(dataNova));
    System.out.println("data antiga é anteriro a nova : " + dataAntiga.isBefore(dataNova));
    System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));

    Period periodo = Period.between(dataAntiga, dataNova);
    System.out.println("Periodo de diferença das data: " +  periodo.getYears() + " Anos "
          + periodo.getMonths() + " Meses " + " e " + periodo.getDays() + " Dias ");
  }
}
