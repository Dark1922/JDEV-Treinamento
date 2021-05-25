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
		

		System.out.println(aluno.toString());//descrição do objeto ná memoria
		
		//aluno = new classObject();
		//System.out.println(aluno);*/
	  
	}
}
