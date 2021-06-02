package ModuloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava2 {

  public static void main(String[] args) throws ParseException {
    Calendar calendar = Calendar.getInstance();//pega a data atual getInstance

    //Simular que a data vem do banco de dados ou qlq outro lugar
    //vai receber a data em string e vai retornar um objeto date
    calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("02-03-2021"));//definindo uma data

    calendar.add(Calendar.DAY_OF_MONTH, - 4);

    System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

  }

}
