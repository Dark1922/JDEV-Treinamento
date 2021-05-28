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
   //enqt minha posição  for menor que as posições da array vai somando até
     // as 4 posições dela
   for(int i = 0; i < 4; i ++) {
       System.out.println("Nota " + (i + 1) + " é = " + notas[i]);
   }
 //nossa nota na posição da array que está sendo varrida
   }

}
