<%@ page import="fr.diginamic.modeles.Produit" %>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, java.lang.reflect.*" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" href="main.css">
</head>

<body>

	<% 
	List<Produit> liste = (List<Produit>)request.getAttribute("listProduits"); 
	String maCatSelectionId =  (String)request.getAttribute("categorieSelectionId");
	String maCatSelectionName =  (String)request.getAttribute("categorieSelectionName");
	String maMarqueSelectionId = (String)request.getAttribute("marqueSelectionId");
	%>


	<main>


		<div class="container">

			<div class="row">
				<div class="col">catégorie selectionnée : <%= maCatSelectionName %>(id: <%= maCatSelectionId %>)</div>
			
			</div>
			<div class="row">
				<div class="col">marque selectionnée : <%= maMarqueSelectionId %></div>
			
			</div>
			
			<table class="table table-hover">
			  <thead>
			    <tr>
			  	  <th scope="col">id</th>
			   	 <th scope="col">nom</th>
			  	  <th scope="col">energie</th>
			  	  <th scope="col">fibre</th>
			  	  <th scope="col">grade nutri.</th>
			  	  <th scope="col">graisse</th>  
			    </tr>
			  </thead>
			  
			  
			  
			  <tbody>
			  
			  
			  <% 
			  
			  for (Produit prod : liste) { 
				  %>
				  <tr>
				  <th scope="row"><%= prod.getId()%></th>
				  <th><a class="afficher-<%= prod.getId()  %>" href=""><%= prod.getNom()%></a></th>
				  <th><%= prod.getEnergie()%></th>
				  <th><%= prod.getFibre()%></th>
				  <th><%= prod.getGrade()%></th>
				  <th><%= prod.getGraisse()%></th>
				  </tr>
				  
				  <%
			  }
			  
			  %>
			  
			  
			  
	
			  
			    
			  </tbody>
			  
			</table>
	
				
			    		  
				
			
			
			
		</div>



	</main>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>



	<script src="main.js"></script>

</body>

</html>