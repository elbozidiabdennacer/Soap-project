package Add_book_beblio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import ws.Biblio;
import ws.Controle;
import ws.ControleService;
import ws.ControleServiceLocator;


@WebServlet("/Add_beblio")
public class Add_beblio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Add_beblio() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Biblio bi = new Biblio();
		bi.setIdb(Integer.parseInt(request.getParameter("idbb")));
		bi.setNomB(request.getParameter("nombb"));
		
		ControleService service = new ControleServiceLocator();
	    try {
	    	Controle op = service.getControle();
			op.addBiblio(bi);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
	    response.sendRedirect("/Add_bk_bb.jsp");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
