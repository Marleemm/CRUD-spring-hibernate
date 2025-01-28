<%@page import="com.example.entities.Mascota"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Lista de Mascotas</title>
<style>
/* Estilo básico para la tabla */
table {
	width: 100%;
	border-collapse: collapse;
	margin: 20px 0;
}

th, td {
	padding: 8px;
	text-align: left;
	border: 1px solid #ddd;
}

th {
	background-color: #f2f2f2;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

/* Estilo de los botones */
.btn {
	padding: 5px 10px;
	margin: 5px;
	text-decoration: none;
	color: white;
	border-radius: 3px;
}

.btn-warning {
	background-color: #f39c12;
}

.btn-danger {
	background-color: #e74c3c;
}

.btn:hover {
	opacity: 0.8;
}
</style>
</head>
<body>
	<div>
		<h2>Lista de Mascotas</h2>

		<!-- Tabla de Mascotas -->
		<table>
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Tipo</th>
					<th>Edad</th>
					<th>Descripción</th>

					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<!-- Usamos scriptlet para acceder a la lista 'mascotass' -->
				<%
				// Recuperamos la lista de mascotas del modelo
				List<Mascota> mascotas = (List<Mascota>) request.getAttribute("mascotass");
				// Iteramos sobre la lista de mascotas
				for (Mascota mascota : mascotas) {
				%>
				<tr>
					<td><%=mascota.getNombre()%></td>
					<td><%=mascota.getTipo()%></td>
					<td><%=mascota.getEdad()%></td>
					<td><%=mascota.getDescripcion()%></td>
					<td>
						<!-- Botones para editar y borrar --> <a
						href="editar/<%=mascota.getId()%>" class="btn btn-warning">Editar</a>
						<a href="borrar/<%=mascota.getId()%>">Eliminar</a>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>

</body>
</html>
