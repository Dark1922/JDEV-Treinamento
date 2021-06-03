package TxtExcel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
  public static void main(String[] args) throws IOException {

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

    File arquivo = new File("C:\\Users\\DarkJohn\\IdeaProjects\\untitled\\src\\TxtExcel\\arquivo.txt");

    if(arquivo.exists()) { //se arquivo não existe vai criar um novo arquivo
      arquivo.createNewFile();
    }//objeto de arquivo e objeto que escreve
    FileWriter escrever_no_arquivo = new FileWriter(arquivo); //instacia o objeto que escreve no arquivo

     //varre a lista escrevendo separado por ponto e virgula \n quebra pra proxima linha
    for (Pessoas p : pessoas) {//classe da pessoa , passa um nome qlq p , apotando pra lista de pessoas
      escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
    }


    escrever_no_arquivo.flush(); //persistir essas alterações
    escrever_no_arquivo.close(); //fecha o arquivo aqui
  }
}
