package mod7;

import javax.swing.JOptionPane;

public class entradaDeDados2 {
	public static void main(String[] args) {
		
	String carros =	JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas =	JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	double carroNumero = Double.parseDouble(carros);//vai converter pra numero o valor passado
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisão = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
//ele retorna numeros inteiro ent tem que instancia pra um inteiro
 int resposta = JOptionPane.showConfirmDialog(null, "deseja ver resultado da divisão"); 

 if (resposta == 0) {
	JOptionPane.showConfirmDialog(null,"Divisão para pessoas deu: " + divisão);
	
 }else {
	 System.out.println("não quis ver o resultado");
 }
 
 //apenas usa a variavel resposta pq ela tá declarada acima
 resposta = JOptionPane.showConfirmDialog(null, "deseja ver o resto da divisão");
  if (resposta == 0) {
	 JOptionPane.showConfirmDialog(null,"O resto da divisão é " + resto);
   }else {
		 System.out.println("não quis ver o resultado");
	 }

// == 0 é igual a sim qnd clica no butao de yes ou confirma ou seja se por no ele é o 1 ent n vai mostrar o 
  //resultado da operação massa , e o cancel é o 2
 }

}
