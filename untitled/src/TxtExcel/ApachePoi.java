package TxtExcel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ApachePoi {
  public static void main(String[] args) throws Exception {

    File file = new File(
          "C:\\Users\\DarkJohn\\IdeaProjects\\untitled\\src\\TxtExcel\\arquivo_excel.xls");
    if (!file.exists()) { //se o arquivo não existir vamos criar esse arquivo
      file.createNewFile();

    }
    Pessoas pessoa1 = new Pessoas();
    pessoa1.setEmail("jvdematos004@gmail.com");
    pessoa1.setIdade(21);
    pessoa1.setNome("joao");

    Pessoas pessoa2 = new Pessoas();
    pessoa2.setEmail("pessoa2@email.com");
    pessoa2.setIdade(45);
    pessoa2.setNome("jtadeu");

    Pessoas pessoa3 = new Pessoas();
    pessoa3.setEmail("pessoa3@gmail.com");
    pessoa3.setIdade(33);
    pessoa3.setNome("jubileu");

    //instacia uma lista pode vir do banco de dados ou qualquer fonte de dados
    List<Pessoas> pessoas = new ArrayList<Pessoas>(); //fazendo uma lista da classe Pessoas
    pessoas.add(pessoa1); //adicionando pra lista
    pessoas.add(pessoa2);
    pessoas.add(pessoa3);

    HSSFWorkbook hssfWorkbook = new HSSFWorkbook();//vai ser usado para escrever a planilha
    //criar a planilha aqui
    HSSFSheet linahsPessoa = hssfWorkbook.createSheet("Planilha de pessoas jdev");

    int numeroLinha = 0;
    for(Pessoas p : pessoas) {

      Row linha = linahsPessoa.createRow(numeroLinha ++);//criando a linha na planilha

      int celula = 0;

      Cell celNome = linha.createCell(celula ++);//celula 1
      celNome.setCellValue(p.getNome());//passa o nome da pessoa

      Cell celEmail = linha.createCell(celula ++);//celula 2
      celEmail.setCellValue(p.getEmail());//passa o email da pessoa

      Cell celIdade = linha.createCell(celula ++);//celula 2
      celIdade.setCellValue(p.getIdade());//passa a idade da pessoa
    }//termino de montar a planilha
    FileOutputStream saida = new FileOutputStream(file);//pegao arquivo
    hssfWorkbook.write(saida); //ele vai escrever na saida a planilha em arquivo
    saida.flush();
    saida.close();

    System.out.println("Planilha foi Criada");

  }
}
//para cada pessoa vou criar uma linha e para cada atributo da pessoa  vou criar uma celula
//se o arquivo não existe vai criar temos os dados ficticios simulando os dados que é o pessoas
//ai agente pega os objetos do apache poi hssfWorkbook vai ser usado parar escrever na planilha
//HSSFSHEET agente cria a planilha  agente tem que controlar as linha que estão sendo criadas
//int numeroLinha =0; para cada pessoa vamos criar uma linha  e colcoar suas celulas com os valores
//feito isso termino escreve no arquivo hssfWorkbook.write(saida); e finaliza