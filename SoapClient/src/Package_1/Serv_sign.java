package Package_1;

import java.io.IOException;
import java.io.PrintWriter;


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

/**
 * Servlet implementation class Serv_sign
 */
@WebServlet("/Serv_sign")
public class Serv_sign extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Serv_sign() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();
		String nom = (String) request.getParameter("nom");
		String prenom = (String) request.getParameter("Prenom");
		String Email = (String) request.getParameter("Email");
		String Adresse = (String) request.getParameter("Adresse");
		String Tele = (String) request.getParameter("Tele");
		String pass = (String) request.getParameter("pass");

		if (nom.equals("") || prenom.equals("") || Email.equals("") || Adresse.equals("") || Tele.equals("")
				|| pass.equals("")) {
			request.getRequestDispatcher("/Signin.jsp").forward(request, response);
		} else {
			out.println(nom);

			Client cl = new Client();
			cl.setNomC(nom);
			cl.setPrenomC(prenom);
			cl.setEmail(Email);
			cl.setAddresseC(Adresse);
			cl.setTeleC(Tele);
			cl.setPassword(pass);

			ControleService service = new ControleServiceLocator();
			Controle op = null;
			try {
				op = service.getControle();
			} catch (ServiceException e) {
				
				e.printStackTrace();
			}

			op.ajouter(cl);

			Client cli = op.logIn(Email, pass);
			HttpSession session = request.getSession(true);

			if (cli != null) {

				session.setAttribute("IdC", cli.getIdC());
				session.setAttribute("NomC", cli.getNomC());
				session.setAttribute("PrenomC", cli.getPrenomC());
				session.setAttribute("EmailC", cli.getEmail());
				session.setAttribute("AddresseC", cli.getAddresseC());
				session.setAttribute("TeleC", cli.getTeleC());
				session.setAttribute("Password", cl.getPassword());

				request.getRequestDispatcher("/Accueil.jsp").forward(request, response);

			}
		}

	}

}
