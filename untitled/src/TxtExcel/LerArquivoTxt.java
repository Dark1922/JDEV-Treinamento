package TxtExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {
  public static void main(String[] args) throws FileNotFoundException {
     //entrada de dados do arquivo
    FileInputStream  entradaArquivo = new FileInputStream(new File
          ("C:\\Users\\DarkJohn\\IdeaProjects\\untitled\\src\\TxtExcel\\arquivo.txt"));

    //passa a entrada do arquivo que ele vai ler  e a codificação que eu quero utf-8
    Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

    //enquanto meu lerArquivos tiver dados
    while (lerArquivo.hasNext()) {
      String linha = lerArquivo.nextLine();//próxima linha com método de ler aquivo
                                                  //diferente de null
      if(linha != null && ! linha.isEmpty()) { //se a linha for null e diferente de vazia dai vai imprimir
        System.out.println(linha);//executa as linha
      }
    }
  }
}
