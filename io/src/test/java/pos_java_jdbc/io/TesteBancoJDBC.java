package pos_java_jdbc.io;

import java.util.List;

import org.junit.Test;

import conexao.jdbc.SingleConnection;
import dao.UserPosDao;
import model.Telefone;
import model.Userposjava;


public class TesteBancoJDBC {
	
	@Test
	public void initBanco() {
		UserPosDao userPosDAO = new UserPosDao(); //instaci o nosso dao
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("testesemid"); 
		userposjava.setEmail("emailtestID@gmail.com");
		
		userPosDAO.salvar(userposjava);//passo os dados fixos ficticios que botamos no userposdao
		//e salva no userposjava
	}
	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list = dao.listar();//lista que vai vir do banco
			
			for(Userposjava userposjava : list) {
				System.out.println(userposjava.toString()); //to string com objetos do userposjava
				System.out.println("---------------------------------------------------------");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void initBuscar() {
		UserPosDao dao = new UserPosDao();
		  
		try {
			Userposjava userposjava = dao.buscar(1L); //o id que quer buscar 
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Test
	public void initAtualizar() {
		try {
			
			UserPosDao dao = new UserPosDao();
			
			Userposjava objetoBanco = dao.buscar(4L);
			
			objetoBanco.setNome("Nome mudado com método atualizar");
			dao.atualizar(objetoBanco);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Test
	public void initDeletar() {
		try {
			UserPosDao dao = new UserPosDao();
			dao.deletar(5L);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
   
	@Test
	public void testInsertTelefone() { 
		Telefone telefone = new Telefone(); //objeto telefone instaciado
		telefone.setNumero("(87)983428561");
		telefone.setTipo("celular");
		telefone.setUsuario(4L);
		
		UserPosDao dao = new UserPosDao();
		dao.salvarTelefone(telefone);//método de salvar telefone que criamos
		
	}
}
