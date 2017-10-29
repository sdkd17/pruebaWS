<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="webservices.publicar.DataUsuario" %>
<%@ page import="webservices.publicar.DataUsuarioArray" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alta Usuario</title>
</head>
<body>
	
	<div>
		<% DataUsuario du = (DataUsuario) request.getAttribute("obtener-usuario"); %>
		<table>
			<tbody>
				<tr>
					<th> Nombre </th>
					<th> Cedula </th>
				<tr>
					<td> <%= du.getNombreap() %> </td>
					<td> <%= du.getCedula() %> </td>
			</tbody>
		</table>		
	</div>

	<div>
		<table>
			<tbody>
				<tr>
					<th> Nombre </th>
					<th> Cedula </th>
			<% DataUsuarioArray dus = (DataUsuarioArray) request.getAttribute("mostrar-usuarios"); 
			   for (DataUsuario d : dus.getItem()) { %>
				<tr> 
					<td> <%= d.getNombreap() %> </td>
					<td> <%= d.getCedula() %> </td>		
			<% } %>
			</tbody>
		</table>					
	</div>

	<form action="/cliente/alta-usuario">
		<label>Nombre</label>
		<input type="text" id="nombre" name="nombre">
		
		<label>Apellido</label>
		<input type="text" id="apellido" name="apellido">
		
		<label>Cedula</label>
		<input type="text" id="cedula" name="cedula">
		
		<input type="submit"> 
	</form>
	
	
	
</body>
</html>