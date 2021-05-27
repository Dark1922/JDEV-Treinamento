package aulaExampleBancoSimples;

public class testeConta {

  public static void main(String[] args) {

    contaBancaria bancaria = new contaBancaria();
    bancaria.setDescricao("conta bancaria do joão");

    System.out.println(bancaria);

    bancaria.diminui100Reais();
    bancaria.diminui100Reais();

    System.out.println(bancaria);

    bancaria.sacarDinheiro(3000);
    System.out.println(bancaria);

    bancaria.depositoDinheiro(9000);
    System.out.println(bancaria);

    bancaria.soma100Reais();
    System.out.println(bancaria);



  }

}
