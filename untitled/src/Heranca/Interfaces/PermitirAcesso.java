package Heranca.Interfaces;

//essa interface será o nosso contrat ode autenticação
public interface PermitirAcesso {
  public  boolean autenticar(String login, String senha);

  public  boolean autenticar();  //vai chamar o autenticar do secretario e vai validar


}
