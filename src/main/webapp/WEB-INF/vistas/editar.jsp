<%@page import="com.example.entities.Mascota"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>editar</title>
</head>
<body>

	<%
	// Recuperamos la lista de mascotas del modelo
	Mascota mascota = (Mascota) request.getAttribute("mascota");
	%>
	<h1>Formulario de Información (Editar)</h1>
	<form action="/mascotas/actualizar" method="post">
	
	
	
	
		<input type="text" name="id" placeholder="Id"
			value="<%=mascota.getId()%>
" readonly="true" required><br />
		<input type="text" name="nombre" placeholder="Nombre"
			value="<%=mascota.getNombre()%>
" required><br /> <input
			type="text" name="descripcion" placeholder="Descripción"
			value="<%=mascota.getDescripcion()%>
" required><br /> <input
			type="text" name="edad" placeholder="Edad"
			value="<%=mascota.getEdad()%>
" required><br /> <input
			type="text" name="tipo" placeholder="Tipo"
			value="<%=mascota.getTipo()%>
" required><br />

		<button type="submit">Guardar cambios</button>
	</form>

</body>
</html>