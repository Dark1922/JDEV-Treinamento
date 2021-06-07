package TxtExcel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class ApachePoiEditando2 {

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

      String valorCelula = linha.getCell(0).getStringCellValue();

      linha.getCell(0).setCellValue(valorCelula + "* valor gravado na aula");
    }
    entrada.close();//fecho o arquivo
    FileOutputStream saida = new FileOutputStream(file);//saida de arquivo
    hssfWorkbook.write(saida); //faz a escrita para a saida
    saida.flush();
    saida.close();

    System.out.println("Planilha atualizada ");


  }

}
