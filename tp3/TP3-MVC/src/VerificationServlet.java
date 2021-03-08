

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public VerificationServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		HashMap<String, Exception> errorsMap = new HashMap<String, Exception>();
		try {
			validationEmail(email);
		} catch (Exception e) {
			errorsMap.put("email", e);
		}
		try {
			validationMotsDePasse(pass1, pass2);
		} catch (Exception e2) {
			errorsMap.put("password", e2);
		}
		try {
			validationNom(name);
		} catch (Exception e3) {
			errorsMap.put("name", e3);
		}
		
	}
	public Boolean validationEmail(String email) {
		if (email!=null && !email.equals("")) {
			return true;
		}else {
			return false;	
		}
	}
	public Boolean validationMotsDePasse(String pass1, String pass2) {
		if (!pass1.equals("") && !pass2.equals("") && pass1.length()>2 && pass2.length()>2 && pass1.equals(pass2)) {
			return true;
		}else {
			return false;
		}
	}
	public Boolean validationNom(String name) {
		if (name.equals("")) {
			if (name.length()>3) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	
	}

}
