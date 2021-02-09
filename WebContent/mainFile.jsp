<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page 
	import ="models.Container"
	import = "java.util.ArrayList"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
<div class="card">
	<div class="card-header">
		<h1>Sistema Portuário</h1>
	</div>
	<div class="card-body">
		<div class="card">
		<div class="card-header">
		   <h3>Lista de Containers</h3>
		   <div class="card-body">
		   <%if(request.getAttribute("error") != null){ %>
			<nav class="link link-danger"><h3><%=request.getAttribute("error")%></h3></nav>
			<%} %>
		   		
		   		<%	
		   			ArrayList<Container> resultList = (ArrayList<Container>) request.getAttribute("list");
		   		 %>
		   	
		   	<%
		   	for (int i = 0; i < resultList.size(); i++) {
		   	    Container c = (Container) resultList.get(i);
		   	 %>   
		   	 		<div class="card mt-4">
		   			<div class="card-header text-success">
		   				<h6><%=c.getCliente() %> - <%=c.getNumeroContainer() %></h6>
		   			</div>
		   			<div class="card-body">
		   			  <h6 class="mt-4">
		   			  	  Tipo:      <%=c.getTipo()%></br>
		   			  	  Status:    <%=c.getStatus()%></br>
		   			      Categoria: <%=c.getCategoria()%>
		   			  </h6>
		   			  <a class="btn btn-success" href="getMovimentacaoForm?id=<%=c.getId()%>">Adicionar Movimentação</a>
		   			  <a class="btn btn-primary" href="getContainerUpdate?id=<%=c.getId()%>">Editar Container</a>
		   			  <a class="btn btn-danger" href="deleteContainer?id=<%=c.getId()%>">Excluir Container</a>
		   			  <a class="link link-primary" href="readMovimentacao?id=<%=c.getId()%>">Ver Movimentacões</a>
		   			</div>
		   			</div>
		   	 <%
		   		}
		   	 %>
		  		
		   </div>
		   <a class="btn btn-success" href="/projeto_porto/containerForm.jsp">Adicionar Container</a>
		</div>
	</div>		
				
	</div>
</div>


	
</body>
</html>