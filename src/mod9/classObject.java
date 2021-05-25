package mod9;
//est� � nossa classe/objeto que representa classObject 
public class classObject {

		private String nome; //nome � um texto ent string
		private int idade; //esses s�o os atributos  do aluno
		private String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		
		private calcMedia disciplina  = new calcMedia(); //instancia a classe de nota e disciplina aqui
		
		public void setDisciplina(calcMedia disciplina) {
			this.disciplina = disciplina;
		}
		
		public calcMedia getDisciplina() {
			return disciplina;
		}
		
	   @Override
		public String toString() {
			return "classObject [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado + ", disciplina=" + disciplina + "]";
		}

	public classObject() {
		   //cria os dados na memoria - sendo padr�o do java
	   }
	   public classObject(String nomePadrao) {
		   nome = nomePadrao; //o nome � igual ao nome padrao string
	   }
	   //definir parametro pro construtor oque ele pode receber das classe
	   //pode passar parametros ou n�o pro objeto java
	   public classObject(String nomePadrao, int idadePadrao) {
		   nome = nomePadrao; //o nome � igual ao nome padrao string
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
return (disciplina.getNota1() + disciplina.getNota2() +  disciplina.getNota3() + disciplina.getNota4()) /4;
			
		}
		//M�todo true para aprovado false para reprovado com base na nota
				public boolean getAlunoAprovado() {
					double media = this.getMedia();
					if (media >= 70) {
						return true;
					}else {
						return false;
					}
				}
				
				//m�todo que retorna mensagem pra aprovado e reprovado com base na nota
				public String getAlunoAprovado1() {
					double media = this.getMedia();	
						
					if (media >= 70) {
						return "Aluno aprovado";
						
					}else {
						return "Aluno Reprovado";
					}	
					
				}
		
		
}   
