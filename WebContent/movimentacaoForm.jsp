<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="card">
	<div class="card-body">
		<h2 align="center">Adicionar Movimenta��es</h2>
	</div>
	<div class="card">
	<div class="card-body border" >
		
		<form action="addMovimentacao" method="POST">
		<input type=hidden name="container_id" value="<%=request.getAttribute("container_id")%>">
		<label for="categoria" class="form-label mt-3">Tipo de Movimenta��o: </label>
		<select class="form-select" name="tipo">
			<option value="Embarque">Embarque</option>
			<option value="Descarga">Descarga</option>
			<option value="Gate_in">Gate In</option>
			<option value="Gate_out">Gate out</option>
			<option value="Posicionamento">Posicionamento</option>
			<option value="Pilha">Pilha</option>
			<option value="Pesagem">Pesagem</option>
			<option value="Scanner">Scanner</option>
		</select>
		<label for="entrada" class="form-label mt-3">Entrada:</label>
		<input class="form-control" type="date" name="entrada">
		<input class="form-control" type="time" name="entrada2">
		<label for="saida" class="form-label mt-3">Sa�da: </label>
		<input class="form-control" type="date" name="saida">
		<input class="form-control" type="time" name="saida2">
		
		<button class="btn btn-success mt-4">Salvar</button>
		</form>
	</div>
	</div>
</div>
</body>
</html>