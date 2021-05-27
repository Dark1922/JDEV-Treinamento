package AulaPOO;

import java.math.BigDecimal;

public class ExecutarTeste {
//reponsavel por executar o codigo em java
  public static void main(String[] args) {

    Produto produto = new Produto();
    produto.setId(9L);//TIPO LONG ADICIONA O L NO FINAL
    produto.setNome("Nootbook");
    produto.setValor(BigDecimal.valueOf(6750.99));

    Produto produto2 = new Produto();
    produto2.setId(10L);//TIPO LONG ADICIONA O L NO FINAL
    produto2.setNome("JDEV TREINAMENTO");
    produto2.setValor(BigDecimal.valueOf(239.99));

    Produto produto3 = new Produto();
    produto3.setId(38L);//TIPO LONG ADICIONA O L NO FINAL
    produto3.setNome("Computador i5");
    produto3.setValor(BigDecimal.valueOf(4300.00));



    //vamos fazer o objeto na tela agora
    Venda venda = new Venda();
    //seta os atributos da venda que passamos seu valor
    venda.setDescricaoVenda("Venda curso Formação java");
    venda.setEnderecoDaEntrega("Entrega pelo E-mail");
    venda.setId(10L);//L converte ele para long pra ter um código de venda
    venda.setNomeClient("João Victor");
    //venda.setValorTotal(BigDecimal.valueOf(197.00));//passa como BigDecimal
    venda.getListaProdutos().add(produto);//adiciono produto a lista
    venda.getListaProdutos().add(produto2);//n pode ter validação
    venda.addProduto(produto3);//pode ter validação
    //retorna pra gente o valor do set com o get que retorna os dados, ou recuperando
  /*   System.out.println(venda.toString());
   //MOSTRA A DESCRIÇÃO DO PRODUTO
   for(Produto produtoo : venda.getListaProdutos()) {
      System.out.println("descrição do produto: " + produtoo);
  } */

    System.out.println("Valor total da Variavel Venda :  " + venda.getValorTotal());


}
}
