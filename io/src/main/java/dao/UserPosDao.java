package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.jdbc.SingleConnection;
import model.Userposjava;

public class UserPosDao {
	
	private Connection connection;
	
	public UserPosDao() {
		connection = SingleConnection.getConnection(); //nossa conexão
	}
	public void salvar(Userposjava userposjava) {
		try {
		String sql = "insert into userposjava (id, nome, email) values (?, ?, ?)"; 	
		PreparedStatement insert =  connection.prepareStatement(sql);
		insert.setLong(1, userposjava.getId());
		insert.setString(2, userposjava.getNome());
		insert.setString(3,  userposjava.getEmail());
		insert.execute();
		connection.commit(); //salva no banco
		
		}catch(Exception e) {	
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		}
	}
	//pega o sql prepara ele  ai agente passa os parametros  pela posição do id nome e email 1 2 3
    public List<Userposjava> listar() throws Exception{
    	List<Userposjava> list  = new ArrayList<Userposjava>();
    	
    	String sql = "select * from userposjava"; //selecionar todos objetos atributos da tabela banco de dados
    		
		PreparedStatement statement = connection.prepareStatement(sql);
    	ResultSet resultado = statement.executeQuery();
    	
    	while(resultado.next()) { //eqnt tiver dado
    		Userposjava userposjava = new Userposjava(); //instacia objeto pega do banco e poe na lista
    		userposjava.setId(resultado.getLong("id"));//vai vir do resultado na coluna id
    		userposjava.setNome(resultado.getString("nome"));
    		userposjava.setEmail(resultado.getString("email"));
    		list.add(userposjava);
    	}
    	
		return list;
    	
    }
    public Userposjava buscar(Long id) throws Exception{
    	Userposjava retorno  = new Userposjava();
    	
    	String sql = "select * from userposjava where id = " + id;//onde o id é igual ao id que passado por parametro 
    		
		PreparedStatement statement = connection.prepareStatement(sql);//preparo o sql
    	ResultSet resultado = statement.executeQuery(); //que prepara a consulta
    	
    	while(resultado.next()) { //retorna apenas um ou nenhum
    	
    		retorno.setId(resultado.getLong("id"));//vai vir do resultado na coluna id
    		retorno.setNome(resultado.getString("nome"));
    		retorno.setEmail(resultado.getString("email")); 
    		
    	}
    	
		return retorno;
    }
    
    public void atualizar(Userposjava userposjava) {
    	try {
    	//update set o nome = nome atualizado  onde passa o id escolhido
    	String sql = "update userposjava set nome = ? where id = " + userposjava.getId();
    	PreparedStatement statement = connection.prepareStatement(sql); //prepara o sql
    	statement.setString(1, userposjava.getNome());
    	
    	statement.execute();
    	connection.commit();
    	}catch(Exception e){
    		try {
				connection.rollback(); //caso deia erro rollback pra n fazer atualização no banco
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			} 
    		e.printStackTrace();
    	}
    }
}
