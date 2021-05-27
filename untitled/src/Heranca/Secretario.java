package Heranca;

import Heranca.Interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

  private String registro;
  private String nivelCargo;
  private String experiencia;

  private String login;
  private String senha;

  public Secretario(String login, String senha) {//construtor padrão
     this.login = login;
     this.senha = senha; //nossa senha sera igual a senha passada por parametro msm com login
  }
  public Secretario() {//outro construtor pra n quebrar o código

  }

  @Override
  public String toString() {
    return "Secretario{ " +
          "nome= '" + nome + '\'' +
          ", idade=" + idade +
          ", dataNascimento= '" + dataNascimento + '\'' +
          ", registroGeral= '" + registroGeral + '\'' +
          ", numeroCpf= '" + numeroCpf + '\'' +
          ", nomeMae= '" + nomeMae + '\'' +
          ", nomePai= '" + nomePai + '\'' +
          ", registro= '" + registro + '\'' +
          ", nivelCargo= '" + nivelCargo + '\'' +
          ", experiencia= '" + experiencia + '\'' +
          '}';
  }

  public String getRegistro() {
    return registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }

  public String getNivelCargo() {
    return nivelCargo;
  }

  public void setNivelCargo(String nivelCargo) {
    this.nivelCargo = nivelCargo;
  }

  public String getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(String experiencia) {
    this.experiencia = experiencia;
  }

  @Override
  public double salario() {
    return 1800.80 * 0.9; //tipo como se fosse uma bonificação na regra de negocio lul
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
