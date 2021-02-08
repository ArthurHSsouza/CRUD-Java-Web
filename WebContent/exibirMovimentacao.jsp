<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
<%@ page 

	import ="models.Movimentacao"
	import = "java.util.ArrayList"
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>

	<div class="card">
	<div class="card-header">
		<h1>Sistema Portuário</h1>
	</div>
	<%	
		ArrayList<Movimentacao> resultList = (ArrayList<Movimentacao>) request.getAttribute("list");
	%>
	<div class="card-body">
	<%if(request.getAttribute("error") != null){ %>
	<nav class="link link-danger"><h3><%=request.getAttribute("error")%></h3></nav>
	<%} %>
		<div class="card">
		<div class="card-header">
		   <h3>Lista de Movimentações</h3>
		   <h5>Quantidade de Movimentações: <%=resultList.size()%></h5>
		   <div class="card-body">
		   		
		   		
		   	
		   	<%
		   	for (int i = 0; i < resultList.size(); i++) {
		   	    Movimentacao m = (Movimentacao) resultList.get(i);
		   	 %>   
		   	 		<div class="card mt-4">
		   			<div class="card-header text-success">
		   				<h6><%=m.getTipo()%></h6>
		   			</div>
		   			<div class="card-body">
		   			  <h6 class="mt-4">
		   			  	  Entrada:      <%=m.getEntrada()%></br>
		   			  	  Saida  :    <%=m.getSaida()%></br>
		   			  </h6>
		   			 	<a class="btn btn-primary" href="getMovimentacaoFormUpdate?id=<%=m.getId()%>&container_id=<%=m.getContainer_id()%>">Editar Movimentacão</a>
		   			 	<a class="btn btn-danger" href="deleteMovimentacao?id=<%=m.getId()%>&container_id=<%=m.getContainer_id()%>">Deletar Movimentacão</a>
		   			</div>
		   			</div>
		   	 <%
		   		}
		   	 %>
		  		
		   </div>
		</div>
	</div>		
				
	</div>
</div>
	
</body>
</html>