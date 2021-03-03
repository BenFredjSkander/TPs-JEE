

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Client;

/**
 * Servlet implementation class TransactionServlet
 */
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
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
		int montant = Integer.parseInt(request.getParameter("montant"));
		Client c = new Client(300);
		if (request.getParameterValues("customRadio")[0].equals("virement")) {
			if (c.getSolde()>=montant) {
				System.out.print("virement reussie");
				c.setSolde(c.getSolde()-montant);
			}else {
				System.out.print("problement virement");
			}
		}
		if (request.getParameterValues("customRadio")[0].equals("retrait")) {
			c.setSolde(c.getSolde()-montant);
		}
	}

}
