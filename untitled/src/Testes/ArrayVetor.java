package Testes;

import javax.swing.*;

public class ArrayVetor {
           //método executavel
   public static void main(String[] args) {


   String[] valores = {"joao", "udyr","zac","shen","vlad-yasuo"};

  for (int i = 0; i < valores.length; i++) {
   System.out.println("Array de String " + (i +1) + " NomeString " +valores[i]);
  }


     /*
     String posicoes = JOptionPane.showInputDialog("Quantas posições deve ter o Array");

      //vai transforma string em numeros inteiros
     double[] notas = new double[Integer.parseInt(posicoes)];

  for (int i = 0; i < notas.length; i++) {
     String valor = JOptionPane.showInputDialog("Qual valor da posição =  " + i);
     notas[i] = Double.valueOf(valor);//vai passar o valor que demos pra posição da array
    //e pela quantidade de array que temos , passar o valor pra todas que declaramos

  }


//vai pecorrer o array até ser menor que o tamanho do array própio + dinamico
   for(int i = 0; i < notas.length; i ++) {
       System.out.println("Nota " + (i + 1) + " é = " + notas[i]);
   }
 //nossa nota na posição da array que está sendo varrida*/
   }

}
