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

		classObject aluno = new classObject();// crio 1 objeto

		aluno.setNome(nome);
		aluno.setDataMatricula(dataMatricula);
		aluno.setDataNascimento(dataNascimento);
		aluno.setIdade(Integer.valueOf(idade));// vai transforma idade em um numero inteiro
		aluno.setNomeEscola(nomeEscola);
		aluno.setNomeMae(nomeMae);
		aluno.setNumeroCpf(numeroCpf);
		aluno.setRegistroGeral(registroGeral);
		aluno.setSerieMatriculado(serieMatriculado);
		aluno.setNomePai(nomePai);

		// pos = posição
		for (int pos = 1; pos <= 4; pos++) {// vai ficar dinamico o numero da disciplina que vai aparecer
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno.getDisciplinas().add(disciplina);// adiciona pra lista add
		} // ele recebe um double ent Double.valueOf
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguem disciplina?");

		if (escolha == 0) {//decidiu remover alguma disciplina
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ,4 ?");
			aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);//remove a posição que escolheu
			
		}
		
		System.out.println(aluno.toString());
		System.out.println("Média da nota é: " + aluno.getMedia());
		System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado metodo1: " + aluno.getAlunoAprovado1());

	}
}
