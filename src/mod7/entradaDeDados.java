package mod7;

import javax.swing.JOptionPane;

public class entradaDeDados {
	public static void main(String[] args) {
		
	String carros =	JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas =	JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	double carroNumero = Double.parseDouble(carros);//vai converter pra numero o valor passado
	double pessoaNumero = Double.parseDouble(pessoas);//praq n seja uma string
	  //convers� para interio depois do calculo com double massa se der 4,5 retorna 4 pra gente
	int divis�o = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
	
JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu: " + divis�o + " carros e sobrou: " + resto);
	
	//System.out.println("Divis�o para pessoas deu: " + divis�o + " carros e sobrou: " + resto);
	}

}
