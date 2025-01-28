<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <!-- Incluir estilos desde la carpeta recursos/css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos.css">
    <title>Registro</title>
</head>
<body>
     <h1>Agregar mascota</h1>
 <form action="guardarmascota" method="post">
    <input type="text" name="nombre" placeholder="Nombre" required><br/>
    <input type="text" name="descripcion" placeholder="Descripción" required><br/>
    <input type="number" name="edad" placeholder="Edad" required><br/>
     <input type="text" name="tipo" placeholder="Tipo" required><br/>
    
    <button type="submit">Guardar</button>
    </form>
</body>
</html>
