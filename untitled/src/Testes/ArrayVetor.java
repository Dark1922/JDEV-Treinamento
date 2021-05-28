package Testes;

public class ArrayVetor {
           //método executavel
   public static void main(String[] args) {
     //array pode ser de todos tipo de dados e objetos tb

     //Array sempre deve ter a quantidade de posições definidas
     double[] notas = new double[4]; //array de notas do tipo double numeros
      //instacia ele com o array com o numero da array que é obrigatorio 4 posições

     notas[0] = 9.9; //atribuir valor nas posições no valor do array
     notas[1] = 5;
     notas[2] = 8;
     notas[3] = 10;

     System.out.println(notas.length);
   }

}
