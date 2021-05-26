package mod9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classjava.constante.StatusAluno;
import mod9.classObject;

public class objectContrutor {

	public static void main(String[] args) {
		// instaciação de uma lista para alunos que está em classobject
		List<classObject> alunos = new ArrayList<classObject>();
		
		HashMap<String, List<classObject>> maps = new HashMap<String, List<classObject>>();
		//INTACIAMOS O MAPS AQUI E FIZEMOS O MÉTODO DELE ABAIXO
		//mapa que dentro dele tamos fazendo uma referencia todos alunos em recuperação vai ter uma lista dentro
		//o mesmo para aprovados e reprovados String tipo os aluno e a List que vai ter ele dentro

		for (int qtd = 1; qtd <= 4; qtd++) {//vamos ter 5 alunos

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Digite sua idade"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento"); String
			 * dataMatricula = JOptionPane.showInputDialog("Data matricula"); String
			 * numeroCpf = JOptionPane.showInputDialog("numero cpf"); String registroGeral =
			 * JOptionPane.showInputDialog("RGM"); String serieMatriculado =
			 * JOptionPane.showInputDialog("Matricula"); String nomeMae =
			 * JOptionPane.showInputDialog("Nome de sua mae"); String nomePai =
			 * JOptionPane.showInputDialog("Nome de seu pai"); String nomeEscola =
			 * JOptionPane.showInputDialog("Nome de sua instituição");
			 */

			classObject aluno = new classObject();// crio 1 objeto

			aluno.setNome(nome);
			/*
			 * aluno.setDataMatricula(dataMatricula);
			 * aluno.setDataNascimento(dataNascimento);
			 * aluno.setIdade(Integer.valueOf(idade));// vai transforma idade em um numero
			 * inteiro aluno.setNomeEscola(nomeEscola); aluno.setNomeMae(nomeMae);
			 * aluno.setNumeroCpf(numeroCpf); aluno.setRegistroGeral(registroGeral);
			 * aluno.setSerieMatriculado(serieMatriculado); aluno.setNomePai(nomePai);
			 */

			// pos = posição
			for (int pos = 1; pos <= 1; pos++) {// vai ficar dinamico o numero da disciplina que vai aparecer
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);// adiciona pra lista add
			} 

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguem disciplina?");

			if (escolha == 0) {// decidiu remover alguma disciplina 0 = sim

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ,4 ?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++; // +1 soma
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
				}

			}

			alunos.add(aluno); // vai adicionar o aluno para a lista de array for
			//INICIA OS VALORES DO MAPS.PUSH COM A ARRAY LIST QUE CRIAMOS
			//AI AGENTE PASSA NOSSO METODO ESTATICO , E A ARRAY DE LISTA QUE CRIAMOSA ACIMA SAQUEI
			//O 1 É A KEY INICIALIZADO , E O 2 COM NEW É À LISTA  VAZIA PARA AGENTE PODER USAR O .ADD
			//LA DENTRO DAS CONDIÇÕES IF E ELSE PRA ADICIONAR AO ALUNO QUE É A LISTA DE ALUNOS
			//QUE É UMA LISTA VAZIA SE FOR PREENCHIDA VAI PRA LISTA DO ALUNOS ADICIONAR LÁ QUE É ALUNO
			//PEGA A CHAVE DOS APROVADOS/RECUPERACAO/REPROVADOS QUE FORAM PASSADOS  E RETORNA A LISA DOS ALUNOS
			//PRO ADD(ALUNO); E ADICIONA O MESMO PRA TODOS, E AI AGENTE PEGA O MAPA ALI DO LADO DO 
			//EUQLASIGNORECASE DO LADO DELE AGENTE MASSA O MAPS KEY A CHAVE DO ALUNO APROVADO RECUPERADO REPROVADO
			//E ASSIM PRA TODOS
			maps.put(StatusAluno.APROVADO, new ArrayList<classObject>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<classObject>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<classObject>());
			
		}
		for (classObject aluno: alunos) {//SEPAREI EM LISTAS OS ALUNOS APROVADOS/REPROVADOS/RECUPERACAO
			
			if(aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.APROVADO)) {
		       maps.get(StatusAluno.APROVADO).add(aluno);//vai pegar a chave key do put de cimae lista aluno
			
			}else  //se não se
				if(aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.RECUPERACAO) ) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
					
				}else
					if(aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
				}   
			
		}
		System.out.println("---------------Lista dos Aprovados--------------");
		for (classObject aluno: maps.get(StatusAluno.APROVADO)) {
			for (Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println("Aluno: " + aluno.getNome()  +" Resultado = " +aluno.getAlunoAprovado1() + " Com média de = " + aluno.getMedia() + " Na disciplina = " + disciplina.getDisciplina());
			}
			
		}
		System.out.println("---------------Lista dos de Recuperação--------------");
		for (classObject aluno: maps.get(StatusAluno.RECUPERACAO)) {
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Aluno: " + aluno.getNome()  +" Resultado = " +aluno.getAlunoAprovado1() + " Com média de = " + aluno.getMedia() + " Na disciplina = " + disciplina.getDisciplina());
			}
			
		
		}
		System.out.println("---------------Lista dos Reprovados--------------");
		for (classObject aluno: maps.get(StatusAluno.REPROVADO)) {
			for (Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println("Aluno: " + aluno.getNome()  +" Resultado = " +aluno.getAlunoAprovado1() + " Com média de = " + aluno.getMedia() + " Na disciplina = " + disciplina.getDisciplina());
			}
		}

	   }
		
		
			
		}
		 

	

