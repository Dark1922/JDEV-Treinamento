package TxtExcel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Iterator;

public class ApachePoiEditando {

  public static void main(String[] args) throws Exception {
    File file = new File(
          "C:\\Users\\DarkJohn\\IdeaProjects\\untitled\\src\\TxtExcel\\arquivo_excel.xls");

    FileInputStream entrada = new FileInputStream(file); //entrada de dados

    //prepara a entrada do arquivo xls do excel
    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //passa a entrada
    HSSFSheet planilha = hssfWorkbook.getSheetAt(0);//pegando a planilha

    //pecorrer essas linha
    Iterator<Row> linhaIterator = planilha.iterator();//vai pegar da planilha o iterator

    while (linhaIterator.hasNext()) { //enqt tiver linha no iterator da planilha hasNext
         Row linha  = linhaIterator.next(); //dados da pessoa na linha

      int numeroCelulas=  linha.getPhysicalNumberOfCells();//quantidade de celulas
      Cell cell = linha.createCell(numeroCelulas); // cria a nova celula na linha
      cell.setCellValue("5.487,87");
    }
    entrada.close();//fecho o arquivo
    FileOutputStream saida = new FileOutputStream(file);//saida de arquivo
    hssfWorkbook.write(saida); //faz a escrita para a saida
    saida.flush();
    saida.close();

    System.out.println("Planilha atualizada ");


  }

}
