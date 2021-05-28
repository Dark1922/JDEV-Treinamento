package Testes;

import Heranca.Aluno;
import Heranca.Diretor;
import Heranca.Secretario;

public class TestandoClassesFilhas {
  public static void main(String[] args) {
    Aluno aluno = new Aluno();

    aluno.setNome("João Victor");
    aluno.setNomeEscola("JDEV Treinamento");
    aluno.setIdade(15);

    Diretor diretor = new Diretor();

    diretor.setRegistroGeral("123012933");
    diretor.setNome("José");
    diretor.setIdade(50);

    Secretario secretario = new Secretario();

    secretario.setExperiencia("Administração");
    secretario.setNome("Luiz");
    secretario.setIdade(29);

    aluno.pessoaMaiorIdade();
    diretor.pessoaMaiorIdade();
    secretario.pessoaMaiorIdade();

    System.out.println(aluno.pessoaMaiorIdade() + "- " + aluno.msgMaiorIdade());
    System.out.println(secretario.pessoaMaiorIdade());
    System.out.println(secretario.pessoaMaiorIdade());

    System.out.println(aluno.salario());
    System.out.println(secretario.salario());
    System.out.println(diretor.salario());

   //System.out.println(aluno);
   //System.out.println(diretor);
    //System.out.println(secretario);
  }
}
