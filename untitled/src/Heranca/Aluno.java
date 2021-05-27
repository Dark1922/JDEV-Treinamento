package Heranca;

import Status.StatusALuno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {//se extende a pessoa

   private String dataMatricula;
   private String nomeEscola;
   private String serieMatriculado;

   private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

   @Override
   public String getNome() {
      return nome;
   }

   @Override
   public String toString() {
      return "Aluno{ " +
            "dataMatricula= '" + dataMatricula + '\'' +
            ", nomeEscola= '" + nomeEscola + '\'' +
            ", serieMatriculado= '" + serieMatriculado + '\'' +
            ", disciplinas= " + disciplinas +
            ", nome= '" + nome + '\'' +
            ", idade= " + idade +
            ", dataNascimento= '" + dataNascimento + '\'' +
            ", registroGeral= '" + registroGeral + '\'' +
            ", numeroCpf= '" + numeroCpf + '\'' +
            ", nomeMae= '" + nomeMae + '\'' +
            ", nomePai= '" + nomePai + '\'' +
            '}';
   }

   @Override
   public void setNome(String nome) {
      this.nome = nome;
   }

   @Override
   public int getIdade() {
      return idade;
   }

   @Override
   public void setIdade(int idade) {
      this.idade = idade;
   }

   @Override
   public String getDataNascimento() {
      return dataNascimento;
   }

   @Override
   public void setDataNascimento(String dataNascimento) {
      this.dataNascimento = dataNascimento;
   }

   @Override
   public String getRegistroGeral() {
      return registroGeral;
   }

   @Override
   public void setRegistroGeral(String registroGeral) {
      this.registroGeral = registroGeral;
   }

   @Override
   public String getNumeroCpf() {
      return numeroCpf;
   }

   @Override
   public void setNumeroCpf(String numeroCpf) {
      this.numeroCpf = numeroCpf;
   }

   @Override
   public String getNomeMae() {
      return nomeMae;
   }

   @Override
   public void setNomeMae(String nomeMae) {
      this.nomeMae = nomeMae;
   }

   @Override
   public String getNomePai() {
      return nomePai;
   }

   @Override
   public void setNomePai(String nomePai) {
      this.nomePai = nomePai;
   }



   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Aluno aluno = (Aluno) o;
      return dataMatricula.equals(aluno.dataMatricula) && nomeEscola.equals(aluno.nomeEscola) && serieMatriculado.equals(aluno.serieMatriculado) && disciplinas.equals(aluno.disciplinas);
   }

   @Override
   public int hashCode() {
      return Objects.hash(dataMatricula, nomeEscola, serieMatriculado, disciplinas);
   }

   public String getDataMatricula() {
      return dataMatricula;
   }

   public void setDataMatricula(String dataMatricula) {
      this.dataMatricula = dataMatricula;
   }

   public String getNomeEscola() {
      return nomeEscola;
   }

   public void setNomeEscola(String nomeEscola) {
      this.nomeEscola = nomeEscola;
   }

   public String getSerieMatriculado() {
      return serieMatriculado;
   }

   public void setSerieMatriculado(String serieMatriculado) {
      this.serieMatriculado = serieMatriculado;
   }
   public double getMedia() {
      double somaNotas = 0.0; //inicio como 0

      // pega a disciplina e instancia uma classe e aponta a lista da disciplina
      for (Disciplina disciplina : disciplinas) {
         // vai pecorrer as listas e vai soma as soma das nota da disciplina
         somaNotas += disciplina.getNota();//pega as nota da lista disciplina
      }
      return somaNotas / disciplinas.size();
//vai dividir as notas pela quantidade de objetos de qnts disciplina tem
      //nessa lista como temos 4 disciplinas vai dividir por 4
      // pra ficar de uma forma mais dinamiza e se almentar
      //não ter que ficar almentado pra /4 /5 e assim por diante massa
   }

   public List<Disciplina> getDisciplinas() {
      return disciplinas;
   }

   // Método true para aprovado false para reprovado com base na nota
	/*public boolean getAlunoAprovado() {
		double media = this.getMedia();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
*/
   // método que retorna mensagem pra aprovado e reprovado com base na nota
   public String getAlunoAprovado1() {
      double media = this.getMedia();

      if (media >= 50) {
         if (media >= 70) {
            return StatusALuno.APROVADO; //vai retorna as mensagem que foi definida lá
         }
         return StatusALuno.RECUPERACAO;
      }else {
         return StatusALuno.REPROVADO;
      }

   }


      public void setDisciplinas(List<Disciplina> disciplinas) {
      this.disciplinas = disciplinas;
   }

   @Override /*IDENTIFICA MÉTODO SOBRESCRITO método que já existe na super classe e tamos sobrescrevendo ele*/
   public boolean pessoaMaiorIdade() {

      return idade >= 21;
   }
   public String msgMaiorIdade() {//this pra pegar o pessoaMaiorIdade e passa a mensagem de boolean abaixo
     return this.pessoaMaiorIdade() ? "Opa Aluno é maior de idade" : "ixi Menor de idade";
   }

   @Override
   public double salario() {
      return 1500.90;
   }
}
