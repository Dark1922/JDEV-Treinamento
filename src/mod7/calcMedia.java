package mod7;

import javax.swing.JOptionPane;

public class calcMedia {
	public static void main(String[] args) {
		 //numeris em string
		String nota1 = JOptionPane.showInputDialog("informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("informe a nota 4: ");
		
		//transformando as strings em numeros double
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media =  (dNota1 + dNota2 + dNota3 + dNota4)/4;// calc da media
		
		//M�dia para aprova��o � 70
		if (media >= 50) {
		if(media >= 70) {
			JOptionPane.showMessageDialog(null, "Par�bens voc� foi aprovado com a m�dia de: "  + media);
	   }else {
		JOptionPane.showMessageDialog(null, "Aluno em Recupera��o: " + media);
		}
		
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado2: " + media);
		}
	}

}
