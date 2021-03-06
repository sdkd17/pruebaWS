package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import publicar.DataUsuario;
import publicar.DataUsuarioArray;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		publicar.WebServicesService s = new publicar.WebServicesService();
		publicar.WebServices port = s.getWebServicesPort();
		DataUsuario du = port.obtenerUsuario("00000001");
		
		request.setAttribute("obtener-usuario", du);
		
//		webservices.publicar.WebServicesService s = new webservices.publicar.WebServicesService();
//		webservices.publicar.WebServices port = s.getWebServicesPort();
		DataUsuarioArray dus = port.mostrarUsuarios();
		
		request.setAttribute("mostrar-usuarios", dus);
		
		request.getRequestDispatcher("/WEB-INF/alta-usuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
