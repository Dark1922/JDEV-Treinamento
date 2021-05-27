package aulaExampleBancoSimples;

public class contaBancaria {
    private String descricao;

    private double saldo = 8000;

    //voids precise de retorno nenhum
    public void soma100Reais() {
        saldo += 100;
    }

    public void diminui100Reais() {
        saldo -= 100;
    }

    public void sacarDinheiro(double saque) {
        saldo -= saque;
    }

    public void depositoDinheiro(double deposito) {
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

  @Override
  public String toString() {
    return "contaBancaria{" +
          " descricao = " + descricao + '\'' +
          ", saldo = " + saldo +
          '}';
  }
}
