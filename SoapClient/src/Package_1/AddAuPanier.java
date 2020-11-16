package Package_1;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import ws.Book;
import ws.Controle;
import ws.ControleService;
import ws.ControleServiceLocator;


@WebServlet("/AddAuPanier")
public class AddAuPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddAuPanier() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Book book = (Book) request.getSession().getAttribute("LignePanier");
		
        if(request.getSession().getAttribute("NomC")==null) {
			
        	response.sendRedirect( "/Login.jsp" );
		}
        else {
        
		
		try {
			int id =Integer.parseInt(request.getParameter("id"));
			ControleService service = new ControleServiceLocator();
			Controle fct = service.getControle();
			
			Book book = fct.getBok(id);
			
			int idc=(int) request.getSession().getAttribute("IdC");

			String op =(String) request.getParameter("op");
			

			if (op.equals("plus") ||op.equals("plus2")) {

				fct.addArticle(idc, book.getIdBk());
	 
				if(op.contentEquals("plus"))
					request.getRequestDispatcher("/Panier.jsp").forward(request, response);
				else
					request.getRequestDispatcher("/Accueil.jsp").forward(request, response);;
					
			}
			
			

			else if (op.equals("sous")) {
				
				fct.sousArticle(idc, book.getIdBk());
				
				request.getRequestDispatcher("/Panier.jsp").forward(request, response);;

			}
			
			
			else if (op.equals("elim")) {
				
				fct.removeArticle(idc, book.getIdBk());
			
				request.getRequestDispatcher( "/Panier.jsp" ).forward(request, response);
			}
			
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}

		

	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
