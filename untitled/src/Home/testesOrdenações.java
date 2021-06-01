package Home;

import java.io.IOException;

public class testesOrdenações {
 /* public static void main(String args[]){
    int[] vet = {8, 9, 3, 5, 1};
    int aux = 0;
    int i = 0;

    System.out.println("Vetor desordenado: ");
    for(i = 0; i<5; i++){
      System.out.println(" "+vet[i]);
    }
    System.out.println(" ");

    for(i = 0; i<5; i++){
      for(int j = 0; j<4; j++){
        if(vet[j] > vet[j + 1]){
          aux = vet[j];
          vet[j] = vet[j+1];
          vet[j+1] = aux;
        }
      }
    }
    System.out.println("Vetor organizado:");
    for(i = 0; i<5; i++){
      System.out.println(" "+vet[i]);
    }
  }*/
 public static void main(String[] args) throws IOException {

   int quantidade = 10000;
   int[] vetor = new int[quantidade];

   for (int i = 0; i < vetor.length; i++) {
     vetor[i] = (int) (Math.random()*quantidade);
   }

   long tempoInicial = System.currentTimeMillis();

   insertionSort(vetor);

   long tempoFinal = System.currentTimeMillis();

   System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

 }

  public static void insertionSort(int[] vetor) {
    int j;
    int key;
    int i;

    for (j = 1; j < vetor.length; j++)
    {
      key = vetor[j];
      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
      {
        vetor[i + 1] = vetor[i];
      }
      vetor[i + 1] = key;
    }
  }
}
