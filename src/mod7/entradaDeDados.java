package mod7;

import javax.swing.JOptionPane;

public class entradaDeDados {
	public static void main(String[] args) {
		
	String carros =	JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas =	JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	double carroNumero = Double.parseDouble(carros);//vai converter pra numero o valor passado
	double pessoaNumero = Double.parseDouble(pessoas);//praq n seja uma string
	  //conversõ para interio depois do calculo com double massa se der 4,5 retorna 4 pra gente
	int divisão = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
	
JOptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisão + " carros e sobrou: " + resto);
	
	//System.out.println("Divisão para pessoas deu: " + divisão + " carros e sobrou: " + resto);
	}

}
