package Package_1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;


import ws.Commande;
import ws.Book;
import ws.Controle;
import ws.ControleService;
import ws.ControleServiceLocator;

@WebServlet("/AddCommande")
public class AddCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddCommande() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		
		int idc =(int)session.getAttribute("IdC");
		
		Commande c = new Commande();
		c.setIdC(idc);
		
		ControleService service = new ControleServiceLocator();
		Controle op;
	    
		try {
			op = service.getControle();
			Book[] panie = op.getPanier(idc);
			
			for(Book lp : panie) {
				c.setIdBk(lp.getIdBk());
				c.setQnt(lp.getQnt());
				c.setDate(String.valueOf(new Date()));
				op.addCommande(c);
			}
			
			op.vider(idc);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		

		request.getRequestDispatcher( "/Saved.jsp" ).forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
