package ModuloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExerData {
  public static void main(String[] args) throws ParseException {
   //data formatada
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
  //parse expecificar uma data mais legivel retorna objeto de data
    Date dataVencimentoBoleto  = simpleDateFormat.parse("10/06/2021");

    Date dataAtualHoje = simpleDateFormat.parse("9/06/2021");
     //after após  n pode ser depois ent se tiver no prazo até o dia 10 diia 06 boleto valido
    if(dataVencimentoBoleto.before(dataAtualHoje)) {//se a data 1 é menor que data 2
      System.out.println("Boleto Vencido");
    }else { //se não venceu o boleto
      System.out.println("BOLETO NÃO VENCIDO");
    }
  }

}
