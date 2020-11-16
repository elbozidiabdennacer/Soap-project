package Package_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import ws.Client;
import ws.Controle;
import ws.ControleService;
import ws.ControleServiceLocator;


@WebServlet("/Serv_login")
public class Serv_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Serv_login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("Email_l");
		String pass = request.getParameter("passl");

		ControleService service = new ControleServiceLocator();
		Controle op =null;
		try {
			op = service.getControle();
		} catch (ServiceException e1) {
			
			e1.printStackTrace();
		}
	    
	    Client cl = op.logIn(email, pass);
		
		HttpSession session = request.getSession(true);

		if (cl!=null) {

				session.setAttribute("IdC", cl.getIdC());
				session.setAttribute("NomC", cl.getNomC());
				session.setAttribute("PrenomC", cl.getPrenomC());
				session.setAttribute("EmailC", cl.getEmail());
				session.setAttribute("AddresseC", cl.getAddresseC());
				session.setAttribute("TeleC", cl.getTeleC());
				session.setAttribute("Password", cl.getPassword());
				
				
				if(cl.getIdC()== 1 && cl.getEmail().equals("elbozidi.abdennacer@gmail.com"))
					request.getRequestDispatcher("/AccueilAdmin.jsp").forward(request, response);	
				  
				else
					request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
				
			}

			else {

				request.setAttribute("Erreur", "Veuiller ressaier");
				request.getRequestDispatcher("/Login.jsp").forward(request, response);

			}
			
		}
	

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
