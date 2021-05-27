package Heranca;
//abstract imperi a  instanciação nas outra classe só podemos trabalhar o aluno diretor e pessoa
//não podemos trabalhar diretamente com pessoa pra manter a regra dentro do sistema
public abstract class Pessoa {//objeto pessoa HERANÇA Classe Pai(Atributos comuns a todos objetos)
//super classe pessoa pra economizar código usa protected pra usar no aluno
  //os atributos mais pra ficar mais organizado e ser algo mais agíl
  protected String nome; //protected pros elemento poder ser passado pro aluno
  protected int idade;//ela se extende ao aluno herança
  protected String dataNascimento;
  protected String registroGeral;
  protected String numeroCpf;
  protected String nomeMae;
  protected String nomePai;

  //método abstrato que fica na classe pai é obrigatória para as classes filhas
  public abstract double salario();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getRegistroGeral() {
    return registroGeral;
  }

  public void setRegistroGeral(String registroGeral) {
    this.registroGeral = registroGeral;
  }

  public String getNumeroCpf() {
    return numeroCpf;
  }

  public void setNumeroCpf(String numeroCpf) {
    this.numeroCpf = numeroCpf;
  }

  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public String getNomePai() {
    return nomePai;
  }

  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  //retorna true caso seja 18 anos pra cima senão false
  public boolean pessoaMaiorIdade() {
     return idade >= 18;
  }
}
