package mod9;
//está é nossa classe/objeto que representa classObject 

import java.util.ArrayList;
import java.util.List;

public class classObject {

	private String nome; // nome é um texto ent string
	private int idade; // esses são os atributos do aluno
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	// tem que colcoar a classe nos sinais de maior e menor, sempre bota o s no
	// final qnd é lista
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();// instancia lista no disciplina

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "classObject [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + "]";
	}

	public classObject() {
		// cria os dados na memoria - sendo padrão do java
	}

	public classObject(String nomePadrao) {
		nome = nomePadrao; // o nome é igual ao nome padrao string
	}

	// definir parametro pro construtor oque ele pode receber das classe
	// pode passar parametros ou não pro objeto java
	public classObject(String nomePadrao, int idadePadrao) {
		nome = nomePadrao; // o nome é igual ao nome padrao string
		idade = idadePadrao;
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

	/* Veremos os metodos SETTERS E GETTERS do objeto */
	// Recebe dados
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome; // pode receber o nome sem o this
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		classObject other = (classObject) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
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

	// Método true para aprovado false para reprovado com base na nota
	public boolean getAlunoAprovado() {
		double media = this.getMedia();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	// método que retorna mensagem pra aprovado e reprovado com base na nota
	public String getAlunoAprovado1() {
		double media = this.getMedia();

		if (media >= 70) {
			return "Aluno aprovado";

		} else {
			return "Aluno Reprovado";
		}

	}

}
