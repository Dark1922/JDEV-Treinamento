package mod9;
import javax.swing.JOptionPane;

import mod9.calcMedia;
public class Aluno {
	
	public static void main(String[] args) {
	
		 String nota1 = JOptionPane.showInputDialog("nota1");
		 String nota2 = JOptionPane.showInputDialog("nota2");
		 String nota3 = JOptionPane.showInputDialog("nota3");
		 String nota4 = JOptionPane.showInputDialog("nota4");
		 
		calcMedia calc = new calcMedia();
		calc.setNota1(Double.parseDouble(nota1));//ele recebe uma string e retorna um double
		calc.setNota2(Double.parseDouble(nota2));
		calc.setNota3(Double.parseDouble(nota3));
		calc.setNota4(Double.parseDouble(nota4));
		System.out.println("Média da nota é: " + calc.getMedia());
		System.out.println("Resultado: " + (calc.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado metodo1: " + calc.getAlunoAprovado1());
	}

}
