package TxtExcel;

import Heranca.Pessoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {
  public static void main(String[] args) throws FileNotFoundException {
     //entrada de dados do arquivo
    FileInputStream  entradaArquivo = new FileInputStream(new File
          ("C:\\Users\\DarkJohn\\IdeaProjects\\untitled\\src\\TxtExcel\\arquivo.csv"));

    //passa a entrada do arquivo que ele vai ler  e a codificação que eu quero utf-8
    Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

    List<Pessoas> pessoa = new ArrayList<Pessoas>();

    //enquanto meu lerArquivos tiver dados
    while (lerArquivo.hasNext()) {
      String linha = lerArquivo.nextLine();//próxima linha com método de ler aquivo
                                                  //diferente de null
      if(linha != null && ! linha.isEmpty()) { //se a linha for null e diferente de vazia dai vai imprimir
        String[] dados = linha.split("\\;");//\\ expressão regular e o ;

        Pessoas pessoas = new Pessoas();

        pessoas.setNome(dados[0]);//dados na 1 posição
        pessoas.setEmail(dados[1]);
        pessoas.setIdade(Integer.parseInt(dados[2])); //pq a idade e inteiro
        pessoa.add(pessoas); //pessoa é a lista que criei acima de Pessoas

      }
    }
    for(Pessoas p : pessoa) {
      System.out.println(p);

    }
  }
}
