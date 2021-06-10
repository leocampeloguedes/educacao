package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeanCadastro;
import dao.DaoCadastro;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	DaoCadastro daoCadastro = new DaoCadastro();
	
	public CadastroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome_completo 	= request.getParameter("nome");
		String genero 		 	= request.getParameter("genero");
		String cpf 			 	= request.getParameter("cpf");
		String telefone 	 	= request.getParameter("telefone"); 
		String data_nascimento  = request.getParameter("data_nascimento");
		String email 			= request.getParameter("email");
		String id_cidade 		= request.getParameter("id_cidade");
		String id_escola 		= request.getParameter("id_escola");
		
		BeanCadastro cadastro = new BeanCadastro();
		cadastro.setNome_completo(nome_completo);
		cadastro.setGenero(Integer.parseInt(genero));
		cadastro.setCpf(cpf);
		cadastro.setTelefone(telefone);
		cadastro.setData_nascimento(data_nascimento);
		cadastro.setEmail(email);
		cadastro.setId_cidade(Integer.parseInt(id_cidade));
		cadastro.setId_escola(Integer.parseInt(id_escola));
		
		daoCadastro.salvarCadastro(cadastro);
		
		
	}

}
