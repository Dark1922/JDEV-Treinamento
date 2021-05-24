package mod9;

import mod9.classObject;
public class objectContrutor {
	
	public static void main(String[] args) {
		
	
	classObject aluno = new classObject();//crio 1 objeto
    aluno.setNome("joao");
    aluno.setDataMatricula("07/2018");
    aluno.setDataNascimento("24/10/1999");
    aluno.setIdade(21);
    aluno.setNomeEscola("UDF-Universidade do distrito federa");
    aluno.setNomeMae("marcia");
    aluno.setNumeroCpf("05821275130");
    aluno.setRegistroGeral("3.597.011");
    aluno.setSerieMatriculado("20085435");
    aluno.setNomePai("ugauga");
    
    System.out.println("Nome é: " + aluno.getNome());
    System.out.println("Idade: " + aluno.getIdade());
    System.out.println("Nome da facu: " + aluno.getNomeEscola());
    System.out.println("Nome mae: " + aluno.getNomeMae());
    System.out.println("Numero cpf: " + aluno.getNumeroCpf());
    System.out.println("RGM: " + aluno.getSerieMatriculado());
    System.out.println("paio: " + aluno.getNomePai());
    System.out.println("Data matricula: " + aluno.getDataMatricula());
    System.out.println("Data nascimento: " + aluno.getDataNascimento());
    System.out.println("RGM: " + aluno.getRegistroGeral());
	
	classObject aluno2 = new classObject();
	
	classObject aluno3 = new classObject("joao");
	classObject aluno4 = new classObject("john", 10);
	
	//classObject aluno5 = new  
	
	}
}
