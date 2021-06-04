package TxtExcel;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApachePoi2 {
  public static void main(String[] args) throws Exception {
//entrada de dados
    FileInputStream entrada = new FileInputStream(new File
          ("C:\\Users\\DarkJohn\\IdeaProjects\\untitled\\src\\TxtExcel\\arquivo_excel.xls"));

    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //prepara a entrada do arquivo excel para ler
    HSSFSheet planilha = hssfWorkbook.getSheetAt(0);//pega a primeira planilha do nosso arquivo excel

    //pecorrer as linhas
    Iterator<Row> linhaIterator = planilha.iterator();

    //pecorrer a plhanilha do excel o arquivo declarado acima
    List<Pessoas> pessoas = new ArrayList<Pessoas>();



    while (linhaIterator.hasNext()) {//enquanto tiver linha no arquivo do excel
       Row linha  = linhaIterator.next();//dados da pessoa na linha

      Iterator<Cell> celulas = linha.iterator();//pra cada linha precisa pecorrer as celulas

      Pessoas pessoa = new Pessoas();

      while(celulas.hasNext()){//enqt tiver celulas hasnext pecorrer as celulas
        Cell cell = celulas.next(); //vai pegar as celulas atuais que é a celulas.next

        switch (cell.getColumnIndex()) {//qual vai ser o indice dela
          case 0: //caso a celular for 0
          pessoa.setNome(cell.getStringCellValue());
          break;
          case 1:
            pessoa.setEmail(cell.getStringCellValue());
            break;
          case 2:
            pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
            break;

        }

      }//fim das celulas da linha
      pessoas.add(pessoa); //seto os dados foi intanciado adiciono para a celula
    }
    entrada.close(); //fechar o arquivo

    for(Pessoas p : pessoas) {
           System.out.println(p);//imprimi o objeto pessoa
    }


  }
}
