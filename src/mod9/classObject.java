package mod9;
//está é nossa classe/objeto que representa classObject 
public class classObject {
	
		
		private String nome; //nome é um texto ent string
		private int idade; //esses são os atributos  do aluno
		private String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		
	   public classObject() {
		   //cria os dados na memoria - sendo padrão do java
	   }
	   public classObject(String nomePadrao) {
		   nome = nomePadrao; //o nome é igual ao nome padrao string
	   }
	   //definir parametro pro construtor oque ele pode receber das classe
	   //pode passar parametros ou não pro objeto java
	   public classObject(String nomePadrao, int idadePadrao) {
		   nome = nomePadrao; //o nome é igual ao nome padrao string
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
	/*Veremos os metodos SETTERS E GETTERS do objeto*/
	   //Recebe dados 
	   public void setNome(String nome) {
		   this.nome = nome;
	   }
	   
	   public String getNome() {
		   return nome; //pode receber o nome sem o this
	   }

}
