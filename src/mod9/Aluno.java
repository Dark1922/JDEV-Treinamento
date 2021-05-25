package mod9;
import javax.swing.JOptionPane;

import mod9.calcMedia;
public class Aluno {
	
	public static void main(String[] args) {
		
		
		 String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		 String nota1 = JOptionPane.showInputDialog("nota1");
		 
		 String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		 String nota2 = JOptionPane.showInputDialog("nota2");
		 
		 String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		 String nota3 = JOptionPane.showInputDialog("nota3");
		 
		 String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		 String nota4 = JOptionPane.showInputDialog("nota4");
		 
		calcMedia calc = new calcMedia();
		calc.setNota1(Double.parseDouble(nota1));//ele recebe uma string e retorna um double
		calc.setNota2(Double.parseDouble(nota2));
		calc.setNota3(Double.parseDouble(nota3));
		calc.setNota4(Double.parseDouble(nota4));
		
		calc.setDisciplina1(disciplina1);
		calc.setDisciplina2(disciplina2);
		calc.setDisciplina3(disciplina3);
		calc.setDisciplina4(disciplina4);
		
		System.out.println(calc.toString());
		System.out.println("Média da nota é: " + calc.getMedia());
		System.out.println("Resultado: " + (calc.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado metodo1: " + calc.getAlunoAprovado1());
	}

}
