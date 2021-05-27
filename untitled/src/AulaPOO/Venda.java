package AulaPOO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

  private Long id;

  private String descricaoVenda;

  private String enderecoDaEntrega;

  public List<Produto> getListaProdutos() {
    return listaProdutos;
  }

  public void setListaProdutos(List<Produto> listaProdutos) {
    this.listaProdutos = listaProdutos;
  }

  private String nomeClient;

  //nosa classe produto instaciada numa lista passando pra variavel listaProdutos
  private List<Produto> listaProdutos = new ArrayList<Produto>();

  @Override
  public String toString() {
    return "Venda{" +
          "id= " + id +
          ", descricaoVenda= '" + descricaoVenda + '\'' +
          ", enderecoDaEntrega= '" + enderecoDaEntrega + '\'' +
          ", valorTotal= " + valorTotal +
          ", nomeClient= '" + nomeClient + '\'' +
          ", listaProdutos= " + listaProdutos +
          '}';
  }

  private BigDecimal valorTotal;

  public String getNomeClient() {
    return nomeClient;
  }

  public void setNomeClient(String nomeClient) {
    this.nomeClient = nomeClient;
  }

  public BigDecimal getValorTotal() {
    //chamo o calculo e retorna o valor pra variavel venda
    this.valorTotal = BigDecimal.valueOf(totalVendas());
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricaoVenda() {
    return descricaoVenda;
  }

  public void setDescricaoVenda(String descricaoVenda) {
    this.descricaoVenda = descricaoVenda;
  }

  public String getEnderecoDaEntrega() {
    return enderecoDaEntrega;
  }

  public void setEnderecoDaEntrega(String enderecoDaEntrega) {
    this.enderecoDaEntrega = enderecoDaEntrega;
  }
  public void addProduto (Produto produto) {
    this.listaProdutos.add(produto);//método que pode ter validação
  }

  private double totalVendas() {
   double total = 0.0;
    for(Produto produto : listaProdutos) {
      total += produto.getValor().doubleValue();//calcula valores double
      //soma do produto
    }
    return total; //retorna o total
  }

}
