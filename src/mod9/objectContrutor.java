package mod9;

import javax.swing.JOptionPane;

import mod9.classObject;
public class objectContrutor {
	
	public static void main(String[] args) {
		
   String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
   String idade = JOptionPane.showInputDialog("Digite sua idade");
   String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
   String dataMatricula = JOptionPane.showInputDialog("Data matricula");
   String numeroCpf = JOptionPane.showInputDialog("numero cpf");
   String registroGeral = JOptionPane.showInputDialog("RGM");
   String serieMatriculado = JOptionPane.showInputDialog("Matricula");
   String nomeMae = JOptionPane.showInputDialog("Nome de sua mae");
   String nomePai = JOptionPane.showInputDialog("Nome de seu pai");
   String nomeEscola = JOptionPane.showInputDialog("Nome de sua instituição");
   
   String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
	 String nota1 = JOptionPane.showInputDialog("nota1");
	 
	 String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
	 String nota2 = JOptionPane.showInputDialog("nota2");
	 
	 String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
	 String nota3 = JOptionPane.showInputDialog("nota3");
	 
	 String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
	 String nota4 = JOptionPane.showInputDialog("nota4");
   
	classObject aluno = new classObject();//crio 1 objeto

	
    aluno.setNome(nome);
    aluno.setDataMatricula(dataMatricula);
    aluno.setDataNascimento(dataNascimento);
    aluno.setIdade(Integer.valueOf(idade));//vai transforma idade em um numero inteiro
    aluno.setNomeEscola(nomeEscola);
    aluno.setNomeMae(nomeMae);
    aluno.setNumeroCpf(numeroCpf);
    aluno.setRegistroGeral(registroGeral);
    aluno.setSerieMatriculado(serieMatriculado);
    aluno.setNomePai(nomePai);
    
	
    aluno.getDisciplina().setNota1(Double.parseDouble(nota1));//ele recebe uma string e retorna um double
    aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
    aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
    aluno.getDisciplina().setNota4(Double.parseDouble(nota4));
	//passa a disciplina com os dados de do calculo de media e com as diciplina tb massa
    aluno.getDisciplina().setDisciplina1(disciplina1);
    aluno.getDisciplina().setDisciplina2(disciplina2);
    aluno.getDisciplina().setDisciplina3(disciplina3);
    aluno.getDisciplina().setDisciplina4(disciplina4);
	
	System.out.println(aluno.toString());
	System.out.println("Média da nota é: " + aluno.getMedia());
	System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	System.out.println("Resultado metodo1: " + aluno.getAlunoAprovado1());
    
	
	
	
   /* //System.out.println("Nome é: " + aluno.getNome());
    //System.out.println("Idade: " + aluno.getIdade());
    //System.out.println("Nome da facu: " + aluno.getNomeEscola());
    //System.out.println("Nome mae: " + aluno.getNomeMae());
    //System.out.println("Numero cpf: " + aluno.getNumeroCpf());
    //System.out.println("RGM: " + aluno.getSerieMatriculado());
    //System.out.println("paio: " + aluno.getNomePai());
    //System.out.println("Data matricula: " + aluno.getDataMatricula());
    //System.out.println("Data nascimento: " + aluno.getDataNascimento());
    //System.out.println("RGM: " + aluno.getRegistroGeral());*/
    
	/*//System.out.println("----------------------------------------------");
	
	//classObject aluno2 = new classObject();
	//aluno2.setNome("hellow baby");
	//aluno2.setIdade(99);
	//System.out.println(aluno2.getNome());
	//System.out.println(aluno2.getIdade());*/
	
	//classObject aluno3 = new classObject("joao");
	//classObject aluno4 = new classObject("john", 10);
	
	//classObject aluno5 = new  
		

		//System.out.println(aluno.toString());//descrição do objeto ná memoria
		

	  
	}
}
