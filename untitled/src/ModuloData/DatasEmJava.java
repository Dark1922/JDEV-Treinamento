package ModuloData;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
  public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();

    Date date = new Date();

    System.out.println(" Calendar  em milisegundos: " + calendar.getTimeInMillis());
    System.out.println(" Calendar dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(" Calendar dia semana: " + calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println(" Calendar hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY) );
    System.out.println(" Calendar minutos do dia: " + calendar.get(Calendar.MINUTE) );
    System.out.println(" Calendar segundos do dia: " + calendar.get(Calendar.SECOND) );
    System.out.println(" Calendar mês: " + calendar.get(Calendar.MONTH) );
    System.out.println(" Calendar ano: " + calendar.get(Calendar.YEAR) );

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm.ss");
    System.out.println(" Calendar Data em formato para banco de dados " + simpleDateFormat.format(calendar.getTime()));
    System.out.println(" Calendar Data em formato para banco de dados " +  simpleDateFormat.format(calendar.getInstance().getTime()));

    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
    System.out.println(" Calendar Data em formato para banco de dados " + simpleDateFormat1.format(calendar.getTime()));

/*
    System.out.println("Data atual " + date);
    System.out.println("Data em milisegundos " + date.getTime());
    System.out.println("Dia da semana " + date.getDay());
    System.out.println("Horas " + date.getHours());
    System.out.println("Ano " + (date.getYear() + 1900)); // 1900 - 2021 = 121 + 1900 = 2021
    System.out.println("Dia do mês " + date.getDate());
    System.out.println("Segundos " + date.getSeconds());
    System.out.println("Minutos " + date.getMinutes());
    System.out.println("Mês " + date.getMonth());

     //------------------------- SIMPLE DATE FORMAT ---------

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
    System.out.println("Data em formato para banco de dados " + simpleDateFormat.format(date));

    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm.ss");
    System.out.println("Data em formato padrão e String " + simpleDateFormat2.format(date));
*/

  }
}
