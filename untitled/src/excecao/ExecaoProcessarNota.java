package excecao;
//temos uma filha
public class ExecaoProcessarNota extends Exception {//se extende a classe de erro do java
//ao construit ela agente tem que passar a mensagem de erro
  public ExecaoProcessarNota(String erro) {
    super(erro);//implementao  construtor de erro

  }

}
