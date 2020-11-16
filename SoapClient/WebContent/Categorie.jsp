<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="erreur.jsp" import="java.sql.*"%>
<%@page import="ws.*" %>
<%@page import="java.io.*" %>
<%
    int id=Integer.parseInt(request.getParameter("idbiblio"));

	ControleService service = new ControleServiceLocator();
	Controle op = service.getControle();
    Book[] listbook = op.getBookB(id);
    Biblio[] listcat = op.getCategorie();
    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=listbook[0].getNomB() %></title>
<link rel='stylesheet' type='text/css' href='FichierCss/Accueil.css'>
<style type="text/css">

a{
text-decoration:none;
}

</style>
<script src="scripts/javascript.js"></script>
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

		

			<%
			    for(int j=0;j<listbook.length;j++) {
				int i= 1;
			%>
			<table>
			 <tr>
			  <%while(i<5 && j<listbook.length){%>
			  
				 <th width="150px"    >
				 <a href="Serv_vente?idbook=<%=listbook[j].getIdBk() %>" > <img src="<%=listbook[j].getPath()%>"  onMouseOut="id='ns'" onMouseOver="id='img'" >
				 <br>
		          <%=listbook[j].getNomBk() %></a> <br> 
		          <div class="divi"> <button onclick="window.location.href = 'Serv_vente?idbook=<%=listbook[j].getIdBk() %>';" class="btni">watch</button>
		           <button onclick="window.location.href = 'AddAuPanier?op=plus2&id=<%=listbook[j].getIdBk() %>';" class="btni2">add</button> </div>
				 </th>
				   
				<%
				 
				 i++; j++;
			     }
				%>
					
			</tr>
			</table>
			<br><br>
			<% } %>

		
						
	</div>

	<div class='Your_Book'>
		<p class='p1'>yourbook</p>
		<div class='span'>
		<span class="welcome" id="welcome"><%=Nom %> <%=Prenom %></span>
		
		</div>

		<div class='bien'>

			<div class='menu' id="menu" onclick="myclick2()" >
				<div class='carre'></div>
				<div class='carre'></div>
				<div class='carre'></div>
			</div>

		</div>

	</div>
		
  <div class="panier" id="panier">
	    <ul>
         <li> <a href="Accueil.jsp">Accueil</a></li>
         <%
         for(Biblio bb:listcat){
         %>
        <li> <a href="Categorie.jsp?idbiblio=<%=bb.getIdb()%>"><%=bb.getNomB() %></a></li>
        <%}%>
		
     </ul>
	</div>
</body>
</html>