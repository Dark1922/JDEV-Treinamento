package Testes;

import Heranca.Aluno;
import Heranca.Disciplina;

public class ArrayAluno {
  public static void main(String[] args) {

    double[] notas = {8.8 , 9.7 , 7.6, 6.9};
    double[] notasLogica = {9.8 , 10 , 4, 6.6};

    Aluno aluno = new Aluno(); //instacia aluno
    aluno.setNome("João Victor");
    aluno.setNomeEscola("UDF - Universidade do distrito federal");

    Disciplina disciplina = new Disciplina();
    disciplina.setDisciplina("Curso de java");
    disciplina.setNota(notas);
    aluno.getDisciplinas().add(disciplina);

    Disciplina disciplina2 = new Disciplina();
    disciplina2.setDisciplina("Lógica de programação");
    disciplina2.setNota(notasLogica);
    aluno.getDisciplinas().add(disciplina2);

    Aluno aluno2 = new Aluno(); //instacia aluno
    aluno2.setNome("Anazinha Rosa");
    aluno2.setNomeEscola("JDEV TREINAMENTO JAVA");

    Disciplina disciplina3 = new Disciplina();
    disciplina3.setDisciplina("Curso de java");
    disciplina3.setNota(notas);
    aluno2.getDisciplinas().add(disciplina3);

    Disciplina disciplina4 = new Disciplina();
    disciplina4.setDisciplina("Spring boot");
    disciplina4.setNota(notasLogica);
    aluno2.getDisciplinas().add(disciplina4);

    //---------------------------------------------------

    Aluno[] arrayAlunos = new Aluno[2]; //2 objetos aluno e aluno 2
    arrayAlunos[1] = aluno2;
    arrayAlunos[0] = aluno; //objeto que instacio encima do Aluno para aluno
    //array trabalha com for varrendo ele
    //pode chamar tudo que tiver dentro do aluno pq instacio ele acima com aluno
    //tem que fazer dentro do colchetes a posição que é o i e o nome do aluno dessa posição
    for(int i = 0;  i < arrayAlunos.length; i++) {
      System.out.println("Nome do aluno é: " + arrayAlunos[i].getNome());

      for(Disciplina disciplin: arrayAlunos[i].getDisciplinas()) {
        System.out.println("Nome da disciplina é: " + disciplin.getDisciplina());

        for(int inota = 0; inota < disciplin.getNota().length; inota ++) {
          System.out.println("À Nota numero: " + (inota + 1) + " é igual = "+ disciplin.getNota()[inota]);

        }
      }

    }


  }
}
