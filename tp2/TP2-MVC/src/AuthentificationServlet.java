


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Client;

/**
 * Servlet implementation class AuthentificationServlet
 */
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String login = request.getParameter("emailinput");
		String password = request.getParameter("passwordinput");
		Client c = new Client(login, password);
		if (c.Authentification(login, password)==true) {
			request.getRequestDispatcher("/operation.jsp").forward(request, response);
			log("true");
		}else {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			log("false");
		}
		
	}

}
