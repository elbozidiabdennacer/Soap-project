package Add_book_beblio;

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




@WebServlet("/Add_book")
public class Add_book extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Add_book() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	    Book b = new Book();
		
	  b.setNomBk(request.getParameter("nombk"));
	  b.setAuteurBk(request.getParameter("Auteur"));
	  b.setDate_edition(request.getParameter("date_edition"));
	  b.setPrixBx(Double.parseDouble(request.getParameter("prix")));
	  b.setIdB(Integer.parseInt(request.getParameter("beblio")));
	  b.setPath(request.getParameter("path"));
	  
	  ControleService service = new ControleServiceLocator();
	    try {
	    	Controle op = service.getControle();
			op.addBook(b);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
	  
	    response.sendRedirect("/Add_bk_bb.jsp");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
