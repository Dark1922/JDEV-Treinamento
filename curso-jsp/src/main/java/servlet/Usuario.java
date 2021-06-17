package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.BeanCursoJsp;

import javax.servlet.annotation.WebServlet;
import dao.DaoUsuario;

@WebServlet("/salvarUsuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DaoUsuario daoUsuario = new DaoUsuario();

	public Usuario() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String acao = request.getParameter("acao");
			String user = request.getParameter("user");
			// se a��o equal ignore � igual ao delete vai pegar o objeto delete user e vai
			// deletar
			if (acao.equalsIgnoreCase("delete")) {
				daoUsuario.delete(user);

				// deleto tem que carregar os usuarios para a mesma p�gina atualizar os usuario
				// exst
				// vai carregar todos menos o que foi deletado
				RequestDispatcher view = request.getRequestDispatcher("cadastroUsuario.jsp");
				request.setAttribute("usuarios", daoUsuario.listar());
				view.forward(request, response);

				// se n�o se se for pra editar vai consultar esse usuario
				// e dai tem que passar um atributo pra nossa p�gina
			} else if (acao.equalsIgnoreCase("editar")) {
				BeanCursoJsp beanCursoJsp = daoUsuario.consultar(user);// consulta esse objt
				RequestDispatcher view = request.getRequestDispatcher("cadastroUsuario.jsp");
				// consulto altero edito redireciona pro usuario o user que vai ser o objet que
				// consultou
				request.setAttribute("user", beanCursoJsp);
				view.forward(request, response);
				// ignora se for maiusculo e minusculo
			} else if (acao.equalsIgnoreCase("listartodos")) {// traz os usuarios direto qnd carrega a pagina
				// RequestDispatcher indica pra qual tela vai redirecionar RequestDispatcher
				RequestDispatcher view = request.getRequestDispatcher("cadastroUsuario.jsp");
				// seta o atributo usuario na tabelinha de cadastroUsuario no cadastroUsuario
				// vai injeta

				// toda a lista de usuarios vai no banco e vai carregar
				request.setAttribute("usuarios", daoUsuario.listar());

				// comando pra ele termina dar a resposta pro navegador
				view.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		// se a��o for diferente de null
		if (acao != null && acao.equalsIgnoreCase("reset")) {
			try {
				RequestDispatcher view = request.getRequestDispatcher("cadastroUsuario.jsp");
				request.setAttribute("usuarios", daoUsuario.listar());
				view.forward(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else { // caso n�o reseto vai salvar pega o bloco todo de salvar esse esle
			// abaixo do try catch

			// requisi��o pegando os parametos passados , request dados que tao vindo da
			// tela
			String id = request.getParameter("id"); // nossa id
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			String nome = request.getParameter("nome");
			String fone = request.getParameter("fone");

			BeanCursoJsp usuario = new BeanCursoJsp();
			// setando os dados longparselong pq ele � um long
			// se o id � diferente de vazio ele vai fazer a convers�o se n�o seta como igual
			// a 0
			usuario.setId(!id.isEmpty() ? Long.parseLong(id) : null);//como � long pode retorna nul
			usuario.setLogin(login);
			usuario.setPassword(password); 
			usuario.setNome(nome); // seta pro nosso usuario o nome que resgatou
			usuario.setFone(fone); 
 
			try {//e se id � igual a nul ou vazio ele vai salvar e se passa no m�todo validarLogin
				String msg = null;
				boolean podeInserir = true;
				 //is nul ou id  ele � vazio e !daoUsuario.validarLogin(login) nega fala que � false
				if(id == null || id.isEmpty() && !daoUsuario.validarLogin(login)) {
					msg = "\n Este Login Pertence a um Usu�rio";
					 podeInserir = false;
					
				}else if (id == null || id.isEmpty() && !daoUsuario.validarPassword(password)) {
					msg = "\nUsu�rio j� existe com essa senha";
				podeInserir = false;
				}
				if(msg != null) {//se for diferente de null a mensagem vai mostrar
					request.setAttribute("msg", msg);
				}
				
				if (id == null || id.isEmpty() && daoUsuario.validarLogin(login)  && podeInserir) {
										
					daoUsuario.salvar(usuario);// vai salvar
				}
					 if (id != null && !id.isEmpty() && podeInserir) {//diferente de nul e vazio
						if(daoUsuario.validarLoginUpdat(login, id)) {
							request.setAttribute("msg", "Login j� existe apra outro Usu�rio");
						}else {//se valdiar o login deixa atualizar
						 daoUsuario.atualizar(usuario);
						}
						}

				
					if(!podeInserir) {
						request.setAttribute("user", usuario);//pros dados do usuario continuar ap�s 
						//alguam valida��o de login ou password
					}
					

				RequestDispatcher view = request.getRequestDispatcher("cadastroUsuario.jsp");
				request.setAttribute("usuarios", daoUsuario.listar());
				view.forward(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
