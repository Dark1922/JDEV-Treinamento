package model;

public class BeanUserFone {
	
	private String nome;
	private String numero;
	private String email;
	
	
	//getter e setter / toString
	
	public String getNome() { 
		return nome;
	}
	@Override
	public String toString() {
		return "BeanUserFone [nome= " + nome + ", numero= " + numero + ", email= " + email + "]";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
