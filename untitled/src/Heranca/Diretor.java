package Heranca;

import Heranca.Interfaces.PermitirAcesso;

//classe filha de pessoa que se extende de pessoa
public class Diretor extends Pessoa implements PermitirAcesso { //pega todos atributos da pessoa
  //super classe da pessoa massa
   private  String registroEducacao;
   private int tempoDerecao;

  private String login;
  private String senha;

  public Diretor(String login, String senha) {//construtor padrão
    this.login = login;
    this.senha = senha; //nossa senha sera igual a senha passada por parametro msm com login
  }
  public Diretor() {//outro construtor pra n quebrar o código

  }


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  @Override
  public String toString() {
    return "Diretor{" +
          "registroEducacao= '" + registroEducacao + '\'' +
          ", tempoDerecao= " + tempoDerecao +
          ", titulacao= '" + titulacao + '\'' +
          ", nome= '" + nome + '\'' +
          ", idade= " + idade +
          ", dataNascimento= '" + dataNascimento + '\'' +
          ", registroGeral= '" + registroGeral + '\'' +
          ", numeroCpf= '" + numeroCpf + '\'' +
          ", nomeMae= '" + nomeMae + '\'' +
          ", nomePai= '" + nomePai + '\'' +
          '}';
  }

  private String titulacao;

  public String getRegistroEducacao() {
    return registroEducacao;
  }

  public void setRegistroEducacao(String registroEducacao) {
    this.registroEducacao = registroEducacao;
  }

  public int getTempoDerecao() {
    return tempoDerecao;
  }

  public void setTempoDerecao(int tempoDerecao) {
    this.tempoDerecao = tempoDerecao;
  }

  public String getTitulacao() {
    return titulacao;
  }

  public void setTitulacao(String titulacao) {
    this.titulacao = titulacao;
  }

  @Override
  public double salario() {
    return 3900.78;
  }
  //ESSE É O MÉTODO DO CONTRATO DE AUTENTICAÇÃO
  @Override
  public boolean autenticar(String login, String senha) {
    this.login = login;
    this.senha = senha; // pra n quebrar o código passa aqui tb
    return autenticar();//chamo o de baixo autenticar
  }

  @Override
  public boolean autenticar() {
    return login.equals("admin") && senha.equals("admin123");
  }

}
