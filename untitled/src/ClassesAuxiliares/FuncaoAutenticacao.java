package ClassesAuxiliares;

import Heranca.Interfaces.PermitirAcesso;

//Realmente e somente receber  alguem que tenha contrato da interface de permitir acesso e chamar o autenticar
public class FuncaoAutenticacao {

  private PermitirAcesso permitirAcesso;

  public boolean autenticar() {

     return permitirAcesso.autenticar();
     //rectorna o permitiracesso autenticar da interface
     //so vai receber quem realmente tiver nosso contrato quem tiver essa nossa implementação
      }

    public FuncaoAutenticacao(PermitirAcesso acesso) {//obrigatóriamente tem que receber o parametro dentro
      //que é o PermitirAcesso acesso
        this.permitirAcesso = acesso;
   //perrmitirAcesso é igual oque eu recebi por parametro
  }
}
