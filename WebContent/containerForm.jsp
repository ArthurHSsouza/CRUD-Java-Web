<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Sistema Portuário</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
<div class="card">

	<div class="card-body">
		<h2 align="center">Adicionar Containers</h2>
	</div>
	<div class="card">
	<div class="card-body border" >
	
		<form action="addContainer" method="POST">
		<input class="form-control" name="cliente" placeholder="insira o nome do cliente">
		<input class="form-control mt-3" name="numeroContainer" placeholder="Container">
		
		<label for="tipo" class="form-label mt-3">Tipo: </label>
		<select class="form-select" name="tipo">
			<option value="20">20</option>
			<option value="40">40</option>
		</select>
		
		<label for="status" class="form-label mt-3">Status: </label>
		<select class="form-select" name="status">
			<option value="Cheio">Cheio</option>
			<option value="Vazio">Vazio</option>
		</select>
		
		<label for="categoria" class="form-label mt-3">Categoria: </label>
		<select class="form-select" name="categoria">
			<option value="Importação">Importação</option>
			<option value="Exportação">Exportação</option>
		</select>
		
		<button class="btn btn-success mt-4">Salvar</button>
		</form>
	</div>
	</div>
</div>
</body>
</html>