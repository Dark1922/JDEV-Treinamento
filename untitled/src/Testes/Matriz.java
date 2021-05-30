package Testes;

public class Matriz {

  public static void main(String[] args) {
    //matriz
    int notas[][] = new int[2][3]; //tem que ter [][] pra ser uma matriz 1 posição com 3 valor

    notas[0][0] = 80; //1 coluna
    notas[0][1] = 90; //2 coluna
    notas[0][2] = 70; //3 coluna

    notas[1][0] = 40; //1 coluna 2 linha
    notas[1][1] = 30; //2 coluna
    notas[1][2] = 20; //3 coluna



    for(int poslinha = 0;  poslinha < notas.length; poslinha ++) {//pecorre as linha
          System.out.println("=============================================");
      //pecorrer as colunas
      for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++ ) {
        System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);

      }

    }

  }
}
