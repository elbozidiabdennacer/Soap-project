package ws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Operations {

	// ajouter un client
	@WebMethod(operationName = "addclient")
	public void ajouter(Client c) {

		try {
			Connection cnx = DBInterection.getConnection();
			String query = "INSERT INTO client (NomC, PrenomC, EmailC, AddresseC, TeleC, Password) VALUES (?,?,?,?,?,?)";
			PreparedStatement prepare = (PreparedStatement) cnx.prepareStatement(query);

			prepare.setString(1, c.getNomC());
			prepare.setString(2, c.getPrenomC());
			prepare.setString(3, c.getEmail());
			prepare.setString(4, c.getAddresseC());
			prepare.setString(5, c.getTeleC());
			prepare.setString(6, c.getPassword());

			prepare.execute();
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@WebMethod
	public boolean estAdmin(String email, String pass) {

		try {
			String query = "SELECT EmailC,Password FROM client where IdC=1";
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet resultat = st.executeQuery(query);
			resultat.next();
			System.out.println("admin ok");
			return (resultat.getString("EmailC").equals(email) && resultat.getString("Password").equals(pass));

		} catch (SQLException e) {

			return false;
		}

	}

	@WebMethod
	public ArrayList<Client> getClients(String email, String pass) {

		if (estAdmin(email, pass)) {

			ArrayList<Client> listclient = new ArrayList<Client>();

			try {
				String query = "SELECT * FROM client";
				Connection cnx = DBInterection.getConnection();
				Statement st = cnx.createStatement();
				ResultSet res = st.executeQuery(query);

				while (res.next()) {

					Client client = new Client();
					client.setIdC(res.getInt(1));
					client.setNomC(res.getString(2));
					client.setPrenomC(res.getString(3));
					client.setEmail(res.getString(4));
					client.setAddresseC(res.getString(5));
					client.setTeleC(res.getString(6));
					client.setPassword(res.getString(7));

					listclient.add(client);
				}

				
				return listclient;

			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}

	@WebMethod
	public Client logIn(String email, String pass) {

		Client client = null;
		try {

			String query = "SELECT * FROM client WHERE EmailC= '" + email + "' AND Password = '" + pass + "'";
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet res = st.executeQuery(query);

			if (res.next()) {
				client = new Client();
				client.setIdC(res.getInt(1));
				client.setNomC(res.getString(2));
				client.setPrenomC(res.getString(3));
				client.setEmail(res.getString(4));
				client.setAddresseC(res.getString(5));
				client.setTeleC(res.getString(6));
				client.setPassword(res.getString(7));

			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return client;
	}

	@WebMethod
	public void addCommande(Commande c) {

		try {
			Connection cnx = DBInterection.getConnection();
			String query = "INSERT INTO commande(IdC, IdBk,quantite, Date) VALUES (?,?,?,?)";
			PreparedStatement prepare = (PreparedStatement) cnx.prepareStatement(query);

			prepare.setInt(1, c.getIdC());
			prepare.setInt(2, c.getIdBk());
			prepare.setInt(3, c.getQnt());
			prepare.setString(4, c.getDate());
			prepare.execute();
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@WebMethod
	public ArrayList<Commande> getCommandes(String email, String pass) {

		if (estAdmin(email, pass)) {

			ArrayList<Commande> listcmd = new ArrayList<Commande>();
			try {
				String query = "SELECT cl.IdC, cl.NomC, cl.PrenomC, cl.EmailC, cl.AddresseC, cl.TeleC, b.NomBk, b.IdBk, cm.quantite, cm.Date  FROM client cl, commande cm, books b "
						+ "WHERE cm.IdC=cl.IdC and cm.IdBk=b.IdBk";
				Connection cnx = DBInterection.getConnection();
				Statement st = cnx.createStatement();
				ResultSet res = st.executeQuery(query);

				while (res.next()) {

					Commande cmd = new Commande();
					cmd.setIdC(res.getInt(1));
					cmd.setNomC(res.getString(2));
					cmd.setPrenomC(res.getString(3));
					cmd.setEmailC(res.getString(4));
					cmd.setAddresseC(res.getString(5));
					cmd.setTeleC(res.getString(6));
					cmd.setNomBk(res.getString(7));
					cmd.setIdBk(res.getInt(8));
					cmd.setQnt(res.getInt(9));
					cmd.setDate(res.getString(10));

					listcmd.add(cmd);
				}

				
				return listcmd;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}

		return null;

	}

	@WebMethod
	public void addBook(Book b) throws FileNotFoundException {

		try {
			String query = "INSERT INTO books(IdBk, NomBk, AuteurBk, Date_edition, PrixBk, ImageBk,pthimage, IdB) VALUES (?,?,?,?,?,?,?,?)";

			Connection cnx = DBInterection.getConnection();
			PreparedStatement prepare = (PreparedStatement) cnx.prepareStatement(query);

			prepare.setInt(1, b.getIdBk());
			prepare.setString(2, b.getNomBk());
			prepare.setString(3, b.getAuteurBk());
			prepare.setString(4, b.getDate_edition());
			prepare.setDouble(5, b.getPrixBx());

			if (!b.getPath().equals("")) {
				InputStream imgg = new FileInputStream(new File(b.getPath()));
				prepare.setBlob(6, imgg);
			}
			prepare.setString(7, b.getPath());
			prepare.setInt(8, b.getIdB());

			prepare.execute();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@WebMethod
	public void addBiblio(Biblio bb) {

		try {

			String query = "INSERT INTO biblio(IdB, NomB) VALUES (?,?)";
			Connection cnx = DBInterection.getConnection();
			PreparedStatement prepare = (PreparedStatement) cnx.prepareStatement(query);

			prepare.setInt(1, bb.getIdb());
			prepare.setString(2, bb.getNomB());
			prepare.execute();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@WebMethod
	public ArrayList<Book> getBook() {

		ArrayList<Book> listbooks = new ArrayList<Book>();
		try {
			String query = "SELECT * FROM books ";
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet resultat = st.executeQuery(query);

			while (resultat.next()) {

				Book book = new Book();
				book.setIdBk(resultat.getInt(1));
				book.setNomBk(resultat.getString(2));
				book.setAuteurBk(resultat.getString(3));
				book.setDate_edition(resultat.getString(4));
				book.setPrixBx(resultat.getDouble(5));
				book.setPath(resultat.getString(7));
				book.setIdB(resultat.getInt(8));

				listbooks.add(book);
			}
 
			
			return listbooks;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@WebMethod
	public Book getBok(int id) {

		Book book = null;

		try {
			String query = "SELECT * FROM books WHERE IdBk=" + id + ";";
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet resultat = st.executeQuery(query);

			if (resultat.next()) {
				book = new Book();

				book.setIdBk(resultat.getInt(1));
				book.setNomBk(resultat.getString(2));
				book.setAuteurBk(resultat.getString(3));
				book.setDate_edition(resultat.getString(4));
				book.setPrixBx(resultat.getDouble(5));
				book.setPath(resultat.getString(7));
				book.setIdB(resultat.getInt(8));

			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return book;

	}

	@WebMethod
	public ArrayList<Book> getBookB(int cat) {

		ArrayList<Book> listbooks = new ArrayList<Book>();

		try {
			String query = "select * from books b, biblio o where b.IdB=o.Idb and o.IdB=" + cat + ";";
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet resultat = st.executeQuery(query);

			while (resultat.next()) {

				Book book = new Book();
				book.setIdBk(resultat.getInt(1));
				book.setNomBk(resultat.getString(2));
				book.setAuteurBk(resultat.getString(3));
				book.setDate_edition(resultat.getString(4));
				book.setPrixBx(resultat.getDouble(5));
				book.setPath(resultat.getString(7));
				book.setIdB(resultat.getInt(8));
				book.setNomB(resultat.getString(10));

				listbooks.add(book);
			}

		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		
		return listbooks;

	}

	@WebMethod
	public ArrayList<Biblio> getCategorie() {

		ArrayList<Biblio> listcat = new ArrayList<Biblio>();

		try {
			String query = "SELECT * FROM biblio";
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet resultat = st.executeQuery(query);

			while (resultat.next()) {

				Biblio bib = new Biblio();
				bib.setIdb(resultat.getInt(1));
				bib.setNomB(resultat.getString(2));

				listcat.add(bib);
			}
			
            
			return listcat;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@WebMethod
	public void addArticle(int idc, int idb){

		try {
		String query = "SELECT * FROM panie where IdC =" + idc + " and IdBk=" + idb;
		Connection cnx = DBInterection.getConnection();
		Statement st = cnx.createStatement();
		ResultSet resultat = st.executeQuery(query);

		if (resultat.next()) {
			String sql = "UPDATE panie set Qnt = Qnt+1 WHERE IdC="+idc+" and IdBk=" + idb;
			st.execute(sql);
			
		} else {
			String sql = "INSERT INTO panie (IdC,IdBk,Qnt) VALUES (?,?,?)";
			
			PreparedStatement prepare = (PreparedStatement) cnx.prepareStatement(sql);
			prepare.setInt(1, idc);
			prepare.setInt(2, idb);
			prepare.setInt(3, 1);
			prepare.execute();
			
		}
		
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

	@WebMethod
	public void sousArticle(int idc, int idb){

		String query = "SELECT Qnt FROM panie where IdC =" + idc + " and IdBk=" + idb;
		
		 
		try {
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			ResultSet resultat = st.executeQuery(query);
			resultat.next();
			
			if (resultat.getInt(1) > 1) {
				String sql = "UPDATE panie set Qnt =Qnt-1 WHERE IdC=" + idc + " and IdBk=" + idb;
				st.execute(sql);
				
			} else {
				String sql = "DELETE FROM panie WHERE IdC=" + idc + " and IdBk=" + idb;
				st.execute(sql);
			}
			
			
		} catch (SQLException e) {
			
		}
		
		
		
	}

	@WebMethod
	public void removeArticle(int idc, int idb){


		try {
			String sql = "DELETE FROM panie WHERE IdC=" + idc + " and IdBk=" + idb;
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			st.execute(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@WebMethod
	public void vider(int idc) {

		
		try {
			String sql = "DELETE FROM panie WHERE IdC=" + idc;
			Connection cnx = DBInterection.getConnection();
			Statement st = cnx.createStatement();
			st.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	@WebMethod
	public ArrayList<Book> getPanier(int idc){
		
		ArrayList<Book> panier = new ArrayList<Book>(); 
		
		try {
		String query = "SELECT * FROM books b, panie p where p.IdBk=b.IdBk and p.IdC="+idc+";";
		Connection cnx = DBInterection.getConnection();
		Statement st = cnx.createStatement();
		ResultSet resultat = st.executeQuery(query);
		while(resultat.next()) {
			
			Book book = new Book();
			book.setIdBk(resultat.getInt(1));
			book.setNomBk(resultat.getString(2));
			book.setAuteurBk(resultat.getString(3));
			book.setDate_edition(resultat.getString(4));
			book.setPrixBx(resultat.getDouble(5));
			book.setPath(resultat.getString(7));
			book.setIdB(resultat.getInt(8));
			book.setNomB(resultat.getString(10));
			book.setQnt(resultat.getInt("Qnt"));
			
			panier.add(book);
		}
		
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return panier;
	}
	
}














