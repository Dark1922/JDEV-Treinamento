package mod7;

import javax.swing.JOptionPane;

public class entradaDeDados2 {
	public static void main(String[] args) {
		
	String carros =	JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas =	JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	double carroNumero = Double.parseDouble(carros);//vai converter pra numero o valor passado
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divis�o = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
//ele retorna numeros inteiro ent tem que instancia pra um inteiro
 int resposta = JOptionPane.showConfirmDialog(null, "deseja ver resultado da divis�o"); 

 if (resposta == 0) {
	JOptionPane.showConfirmDialog(null,"Divis�o para pessoas deu: " + divis�o);
	
 }else {
	 System.out.println("n�o quis ver o resultado");
 }
 
 //apenas usa a variavel resposta pq ela t� declarada acima
 resposta = JOptionPane.showConfirmDialog(null, "deseja ver o resto da divis�o");
  if (resposta == 0) {
	 JOptionPane.showConfirmDialog(null,"O resto da divis�o � " + resto);
   }else {
		 System.out.println("n�o quis ver o resultado");
	 }

// == 0 � igual a sim qnd clica no butao de yes ou confirma ou seja se por no ele � o 1 ent n vai mostrar o 
  //resultado da opera��o massa , e o cancel � o 2
 }

}
