package mod9;
//est� � nossa classe/objeto que representa classObject 
public class classObject {
	
		
		String nome; //nome � um texto ent string
		int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculado;
		
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

}
