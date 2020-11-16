<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="erreur.jsp" import="java.sql.*"%>
<%@page import="ws.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.*" %>
<% 
        if(request.getSession().getAttribute("IdC") == null)
        {
            response.sendRedirect("Login.jsp");
        }
%>
<%
	String email=(String)request.getSession().getAttribute("EmailC");
	String pass=(String)request.getSession().getAttribute("Password");
	
	ControleService service = new ControleServiceLocator();
    Controle op = service.getControle();
    Client[] listcli = op.getClients(email, pass);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link rel='stylesheet' type='text/css' href='FichierCss/AdminAccueil.css'>
<style type="text/css">

a{
text-decoration:none;
}
</style>

<script src="javascript.js"></script>
</head>
<body>


   <%
    String Nom="",Prenom="";
   if(session.getAttribute("NomC")!=null){
	   Nom =(String) session.getAttribute("NomC");
	   Prenom = (String) session.getAttribute("PrenomC");
	   
   }
	   
   %>
   
   <div class="info">
    
	     <div class="slid">
	       <img src="Image/Slide/livre1.jpg" alt="" id="slide" class="slide">
		 </div>
		 
		 <ul class="list">
		   
		  <li class="list2"> Connexion
		    <ul>
		     <li><a href="Login.jsp">Login</a></li>
		     <li><a href="Signin.jsp">Signin</a></li>
		     <li><a href="Logout">Logout</a></li>
		    </ul>
		  </li>
		  
		 <li class="list2"><a href="Panier.jsp">Panier</a></li>
		  
		  <li class="list2"> Contact moi
		     <ul>
		       <li>Email :abdennacer@gmail.com</li>
		       <li>Télé  :0621547589</li>
		     </ul>
		   </li>
		 
		 </ul>
		 
	</div>

	<div class="tab-books">
	<table border="1">
		 <tr style="color:black;">
		 <th>Nom Prenom</th>
		 <th>Addresse</th>
		 <th>Email </th>
		 </tr>
	   <%
	   for(Client cl:listcli){
	   %>
	   <tr>
	   <td><%=cl.getIdC() %>. <%=cl.getNomC() %> <%=cl.getPrenomC() %></td>
	   <td><%=cl.getAddresseC() %></td>
	   <td><%=cl.getEmail() %></td>
	   </tr>

       <%} %>
       
     </table>
       
       <ul>
       <li><a href="Add_bk_bb.jsp">Ajouter des livres ou categorie</a></li>
       <li><a href="getCommandes.jsp">Voir les commandes</a></li>
       <li><a href="getClients.jsp">Voir les clients</a></li>
       </ul>

	</div>

	<div class='Your_Book'>
		<p class='p1'>yourbook</p>
		<div class='span'>
		<span class="welcome" id="welcome"><%=Nom %> <%=Prenom %></span>
		
		</div>

	</div>
		
</body>
</html>