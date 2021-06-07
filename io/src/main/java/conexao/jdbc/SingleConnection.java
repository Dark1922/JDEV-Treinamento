package conexao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:postgresql://localhost:5432/posjava";
	private static String password = "84353246mv";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
			conectar();
	}
	
	public SingleConnection() { 
		
		
	}
	
	
	private static void conectar() {
		try {
			if(connection == null) {
				//se a conexão for nul ele vai conectar se n vai fazer nada
				Class.forName("org.postgresql.Driver");//carrega o drive do postgres
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);//n salvar automaticamente
				System.out.println("conectou com sucesso");
			}
			
		}catch(Exception e) {
			e.printStackTrace();//imprimi caso deia algum erro
		}
		
	}
	//publico pq tem que ser acessivel de outros lugares
	public static Connection getConnection() {
		return connection; //vai retorna o objeto connection
	}

}
