<%@ page import="fr.diginamic.modeles.Marque" %>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList" %>

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
	List<Marque> liste = (List<Marque>)request.getAttribute("listMarques"); 
	String maCatSelectionId =  (String)request.getAttribute("categorieSelectionId");
	String maCatSelectionName =  (String)request.getAttribute("categorieSelectionName");
	%>


	<main>


		<div class="container">

			<div>catégorie selectionnée : <%= maCatSelectionName %>(id:<%= maCatSelectionId %>)</div>
			<br>

			<form method="POST" action="http://localhost:8080/open-food-facts-web/afficher">
				<div class="form-group ">
				<input type="text" class="form-control" hidden id="categorieId" name="categorieId" value="<%=maCatSelectionId %>">
					<input type="text" class="form-control" hidden id="categorieName" name="categorieName" value="<%=maCatSelectionName %>">
					<label for="marque">Marques</label>
					<select id="marque" class="form-control" name="marque">
						<option value="0" selected>Selectionnez une marque</option>


						<% for (Marque marq : liste) 
						{ 
						%>
						<option value="<%= marq.getId()  %>"><%= marq.getNom()  %> </option>

						<%
						}
						%>


					</select>
				</div>
				
				



				<div class="form-group">
					<div class="col">
						<!-- 						<button id="btn-submit" type="submit" class="btn btn-primary">Rechercher</button> -->
						<input id="btn-submit" type="submit" class="btn btn-primary" value="Rechercher"></button>
					</div>
				</div>

			</form>

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