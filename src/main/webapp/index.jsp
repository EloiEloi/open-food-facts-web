<%@ page import="fr.diginamic.modeles.Categorie"%>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList"%>

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
	List<Categorie> liste = (List<Categorie>)request.getAttribute("cle1"); 
	%>


	<main>


		<div class="container">

			<form method="POST" action="http://localhost:8080/open-food-facts-web/rechercher">
				<div class="form-group ">
					<label for="categorie">Catégories</label>
					<select id="categorie" name="categorie" class="form-control">
						<option value="0" selected>Selectionnez une catégorie</option>


						<% for (Categorie cat : liste) 
						{ 
						%>
						<option value="<%= cat.getId() %>"><%= cat.getNom() %> </option>

						<%
						}
						%>


					</select>
				</div>

				


				<div class="form-group d-none">
					<label for="marque">Marque</label> 
					<input type="text" class="form-control" id="marque"
						placeholder="saisissez une marque">
				</div>
				
				<div class="form-group d-none">
					<label for="nom">Nom</label> 
					<input type="text" class="form-control" id="nom"
						placeholder="saisissez un nom de produit">
				</div>
				
				<div class="form-group d-none">
					<label for="grade">Grade nutritionnel</label> 
					<select id="grade" class="form-control">
						<option selected>Selectionnez un grade nutrionnel</option>

						<option value="A">A</option>
						<option value="B">B</option>
						<option value="C">C</option>
						<option value="D">D</option>
						<option value="E">E</option>
						<option value="F">F</option>

					</select>
				</div>
				
				<div class="form-group d-none">
				    <label for="energie">Energie</label>
				    <input type="range" class="form-control-range" id="energie">
			  </div>
				
				
				
				<div class="form-group">
					<div class="col">
<!-- 						<button id="btn-submit" type="submit" class="btn btn-primary">Rechercher</button> -->
						<input id="btn-submit" type="submit" class="btn btn-primary" value="Rechercher">
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