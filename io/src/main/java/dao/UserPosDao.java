package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.jdbc.SingleConnection;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class UserPosDao {

	private Connection connection;

	public UserPosDao() {
		connection = SingleConnection.getConnection(); // nossa conexão
	}

	public void salvar(Userposjava userposjava) {
		try {
			String sql = "insert into userposjava (nome, email) values (?, ?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, userposjava.getNome());
			insert.setString(2, userposjava.getEmail());
			insert.execute();
			connection.commit(); // salva no banco

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();

		}
	}

	public void salvarTelefone(Telefone telefone) {
		try {
			String sql = "INSERT INTO telefoneuser(numero, tipo, usuariopessoa) VALUES(?,?,?)";
			PreparedStatement statment = connection.prepareStatement(sql);
			statment.setString(1, telefone.getNumero());// numero 1 parametro pega o getnumero
			statment.setString(2, telefone.getTipo());
			statment.setLong(3, telefone.getUsuario());// id do usuario
			statment.execute();
			connection.commit(); // telefoen feito

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	// pega o sql prepara ele ai agente passa os parametros pela posição do id nome
	// e email 1 2 3
	public List<Userposjava> listar() throws Exception {
		List<Userposjava> list = new ArrayList<Userposjava>();

		String sql = "select * from userposjava"; // selecionar todos objetos atributos da tabela banco de dados

		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) { // eqnt tiver dado
			Userposjava userposjava = new Userposjava(); // instacia objeto pega do banco e poe na lista
			userposjava.setId(resultado.getLong("id"));// vai vir do resultado na coluna id
			userposjava.setNome(resultado.getString("nome"));
			userposjava.setEmail(resultado.getString("email"));
			list.add(userposjava);
		}

		return list;

	}

	public Userposjava buscar(Long id) throws Exception {
		Userposjava retorno = new Userposjava();

		String sql = "select * from userposjava where id = " + id;// onde o id é igual ao id que passado por parametro

		PreparedStatement statement = connection.prepareStatement(sql);// preparo o sql
		ResultSet resultado = statement.executeQuery(); // que prepara a consulta

		while (resultado.next()) { // retorna apenas um ou nenhum

			retorno.setId(resultado.getLong("id"));// vai vir do resultado na coluna id
			retorno.setNome(resultado.getString("nome"));
			retorno.setEmail(resultado.getString("email"));

		}

		return retorno;
	}

	public void atualizar(Userposjava userposjava) {
		try {
			// update set o nome = nome atualizado onde passa o id escolhido
			String sql = "update userposjava set nome = ? where id = " + userposjava.getId();
			PreparedStatement statement = connection.prepareStatement(sql); // prepara o sql
			statement.setString(1, userposjava.getNome());

			statement.execute();
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback(); // caso deia erro rollback pra n fazer atualização no banco
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void deletar(Long id) {
		try {
			String sql = "delete from userposjava where id = " + id;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute(); // prepara ele e executa vai deletar pelo id
			connection.commit();
		} catch (Exception e) {
			try { 
				connection.rollback();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public List<BeanUserFone> listaUserFone(Long idUser) {
		List<BeanUserFone> beanUserFone = new ArrayList<BeanUserFone>();
		// concatena as linha do sql
		String sql = " select nome, numero, email from telefoneuser as fone ";
		sql += " inner join userposjava as userp ";
		sql += " on fone.usuariopessoa = userp.id ";
		sql +=  " where userp.id = " + idUser; // igual ao id que ta sendo passado por
		// parametro vai efetuar o inner join

		
		try { 
			//vai fazer a consulta no banco
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery(); 
			
			while (resultSet.next()) {//eqnt o resultSet tiver dados vai varrer os dados
				BeanUserFone userFone  = new BeanUserFone();//os dados que vai varrer
				//instaciar os dados pra cada linha
				userFone.setEmail(resultSet.getString("email"));
				userFone.setNome(resultSet.getString("nome"));
				userFone.setNumero(resultSet.getString("numero"));//do objeto bean
				
				beanUserFone.add(userFone);//adiciona pra lista o objeto userFone
				//qnd termianar o java traz o retorno dessa lista pra gente
				
			}
		} catch (SQLException e) {  
			try {
				connection.rollback();// caso deia erro pro banco da um rollback
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

		return beanUserFone;
	}
	public void deleteFonesPorUser(Long id) {//id parametro do usuario
		try {
			
		String sqlFone = "delete from telefoneuser where usuariopessoa =" +id;
		String sqlUser = "delete from userposjava where id =" +id;
		
		PreparedStatement  preparedStatment = connection.prepareStatement(sqlFone);
		preparedStatment.executeUpdate();
		connection.commit(); 
		
	    preparedStatment = connection.prepareStatement(sqlUser);
		preparedStatment.executeUpdate();
		connection.commit();
		 
		
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
