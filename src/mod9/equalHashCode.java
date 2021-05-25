package mod9;

public class equalHashCode {
	public static void main(String[] args) {
		
		//Equal E Hashcide (Diferencia e comparar Objetos)
		
		classObject aluno = new classObject();
		
		aluno.setNome("joao");
		
		classObject aluno1 = new classObject();
		
		aluno1.setNome("joao");
		
		if (aluno.equals(aluno1)) {
			System.out.println("alunos são iguais");
		}else {
			System.out.println("alunos diferentes");
		}
		
	}

}
