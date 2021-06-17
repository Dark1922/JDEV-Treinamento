package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.BeanCursoJsp;
import connection.SingleConnection;

public class DaoUsuario {
	 
	private Connection connection;

	public DaoUsuario() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar(BeanCursoJsp usuario)  {
		try {
		
		String sql = "insert into usuario (login, password, nome, fone) values (?, ?, ?, ?)";
		PreparedStatement insert = connection.prepareStatement(sql);
		insert.setString(1, usuario.getLogin());
		insert.setString(2, usuario.getPassword());
		insert.setString(3, usuario.getNome());
		insert.setString(4, usuario.getFone());
		insert.execute();
		connection.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
	}
	
		public List<BeanCursoJsp> listar() throws Exception{
			List<BeanCursoJsp> listar = new ArrayList<BeanCursoJsp>();
			//listar usuarios
			String sql = "select * from usuario";
			
			PreparedStatement statement = connection.prepareStatement(sql);	
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				BeanCursoJsp beanCursoJsp = new BeanCursoJsp();
				beanCursoJsp.setId(resultSet.getLong("id")); //mostra o id
				beanCursoJsp.setLogin(resultSet.getString("login"));
				beanCursoJsp.setPassword(resultSet.getString("password"));
				beanCursoJsp.setNome(resultSet.getString("nome")); //mostra o noem
				beanCursoJsp.setFone(resultSet.getString("fone"));
				 //adiciona pra lista
				listar.add(beanCursoJsp);
			}
			return listar; //retorna a lista
		}
		
		//método do delete
		public void delete (String id) {
			try{
			String sql = " delete from usuario where id = '" + id + "' ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			connection.commit();
			
			}catch(Exception e) {
				e.printStackTrace();
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}

		public BeanCursoJsp consultar(String id) throws Exception {
			 //consultar o usuario que for alterar, com parametro do postgres busca do login
			String sql = "select * from usuario where id ='" + id +"'";
			//prepara o sql de pesquisa pelo login do usuario
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();// pega o resultado
			
			if(resultSet.next()) { //se ter o resultado passa os parametro que quer alterar
				BeanCursoJsp beanCursoJsp = new BeanCursoJsp();
				
				beanCursoJsp.setId(resultSet.getLong("id"));
				beanCursoJsp.setLogin(resultSet.getString("login"));
				beanCursoJsp.setPassword(resultSet.getString("password"));
				beanCursoJsp.setNome(resultSet.getString("nome"));
				beanCursoJsp.setFone(resultSet.getString("fone"));
				
				return beanCursoJsp;
			}
			
			
			return null;
		}
		
		public  boolean validarLogin(String login) throws Exception {
			//as = elias elhias qtd abreviado quantidades
			String sql = "select count(1) as qtd from usuario where login ='" + login +"'";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();// pega o resultado
			if(resultSet.next()) { //se ter o resultado passa os parametro que quer alterar
				//retorna um numero inteiro da quantidade que está recuperando
				//ou ele retorna 0 pq é um contador count ou retorna mairo
				//0 se n tiver login cadastrado com aquele usuario 1 se já tiver
				return resultSet.getInt("qtd") <= 0;//se for menor igual a 0 vai retornar true  e deixar validar
			} //return true se passo pelo result
			
			
			return false;
		}
		//validar se login já existe na hora do update
		public  boolean validarLoginUpdat(String login, String id) throws Exception {
			//as = elias elhias qtd abreviado quantidades
			//vamos selecionar na tabela usuario onde o login é igual o login que eu informei na hora de atualizar
			//e o id é difente do objeto do usuario que eu estou atualizando quer dizer que já tem esse login
			//para outro e eu não posso deixar
			String sql = "select count(1) as qtd from usuario where login ='" + login +"' and id <> " + id;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();// pega o resultado
			if(resultSet.next()) { //se ter o resultado passa os parametro que quer alterar
				//retorna um numero inteiro da quantidade que está recuperando
				//ou ele retorna 0 pq é um contador count ou retorna mairo
				//0 se n tiver login cadastrado com aquele usuario 1 se já tiver
				return resultSet.getInt("qtd") <= 0;//se for menor igual a 0 vai retornar true  e deixar validar
			} //return true se passo pelo result
			
			
			return false;
		}
		
		public boolean validarPassword(String password) throws Exception {
			String sql = "select count(1) as qtd from usuario where password ='" + password +"'";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				return resultSet.getInt("qtd") <= 0; //se n tiver a senha true
			}
			return false; //se já tiver a senha retornando o valor 1 vai dar false pro cadastro
		}
		
		
       //método de atualizar usuario pelo que for passado por parametro onde o id é o usuario.getid
		public void atualizar(BeanCursoJsp usuario) {
			try {
			String sql = "update usuario set login = ?, password = ?, nome = ?, fone = ? where id =" + usuario.getId();
			PreparedStatement preparedStatemente = connection.prepareStatement(sql);
			//nossa estrução sql
			preparedStatemente.setString(1, usuario.getLogin());
			preparedStatemente.setString(2, usuario.getPassword());
			preparedStatemente.setString(3, usuario.getNome());
			preparedStatemente.setString(4, usuario.getFone());
			preparedStatemente.executeUpdate(); //executa a atualização com o sql
			connection.commit(); //commit se tiver tudo ok
			//tratamento de exceções
			}catch(Exception e){
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
}
