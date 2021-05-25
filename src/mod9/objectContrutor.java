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
    
    //lista da disciplina gerada
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Banco de dados");//nome da disciplina
	disciplina.setNota(90);//criado na nossa classe disciplina , valor da nota
	
	
	//instaciou e criou os elemento da lista massa 
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Matematica");
	disciplina2.setNota(80);

	
	Disciplina disciplina3 = new Disciplina();
	disciplina3.setDisciplina("Nodejs");
	disciplina3.setNota(88);

	
	Disciplina disciplina4 = new Disciplina();
	disciplina4.setDisciplina("Engles");
	disciplina4.setNota(50);

	
	aluno.getDisciplinas().add(disciplina);
	aluno.getDisciplinas().add(disciplina2);//adiciono pra lista
	aluno.getDisciplinas().add(disciplina3);
	aluno.getDisciplinas().add(disciplina4);
	
	System.out.println(aluno.toString());
	System.out.println("Média da nota é: " + aluno.getMedia());
	System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	System.out.println("Resultado metodo1: " + aluno.getAlunoAprovado1());
    
	
		

	  
	}
}
