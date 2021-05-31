package Testes;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
  public static void main(String[] args) {
    String texto = "joao, curso java , 80 , 90, 89 , 20";
    String[] valoresArray = texto.split(",");

    System.out.println("nome: " + valoresArray[0]);
    System.out.println("curso:" + valoresArray[1]);
    System.out.println("nota 1:" + valoresArray[2]);
    System.out.println("nota 2:" + valoresArray[3]);
    System.out.println("nota 3:" + valoresArray[4]);
    System.out.println("nota 4:" + valoresArray[5]);

    //Convetendo um array em uma lista
    List<String> list = Arrays.asList(valoresArray);
    for(String valorString: list) {//varrendo a lista instaciada emcima do valoresArray
            System.out.println(valorString);
    }
    //Converter uma lista para array
    String[] conversaoArray = list.toArray(new String[6]); //de seis posições
    for(int i = 0; i < conversaoArray.length; i ++) {
      System.out.println(conversaoArray[i]);
    }
  }

}
