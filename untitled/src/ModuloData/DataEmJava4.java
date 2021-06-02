package ModuloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava4 {
  public static void main(String[] args) throws ParseException {

   Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("02/06/2021");//data inicial

    //apartir dessa data agente instacia o objeto calendar
    Calendar calendar = Calendar.getInstance();
    //data que agente definiu
    calendar.setTime(dataInicial);//passa a data inicial

    for(int parcela = 1; parcela <= 12; parcela ++ ) {
      calendar.add(Calendar.MONTH, 1);//12 vezes esse processo aqui cada mes adiciona +1
       //cada iteração adiciona 1 mês ent temos 12 parcelas
      System.out.println("Parcela de número: " + parcela + " Vence em: "
            + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

    }

  }
}
