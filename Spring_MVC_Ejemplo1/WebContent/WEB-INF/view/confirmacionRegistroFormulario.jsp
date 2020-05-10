<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de Registro</title>
</head>
<body>

El alumno <strong>${elAlumno.nombre}</strong> y apellido <strong>${elAlumno.apellido} </strong> ,
 edad <strong>${elAlumno.edad}</strong> 
 ,E-mail <strong>${elAlumno.email}</strong>,  
 y C. Postal <strong>${elAlumno.codigoPostal}</strong>  
 se ha registrado con exito.
<br/>
La asignatura escogida es: <strong>${elAlumno.optativa}</strong>
<br/>
La ciudad donde iniciara los estudiosel alumno es: <strong>${elAlumno.ciudadEstudios} </strong>
<br/>
Los idiomas escogidos por el alumno son: <strong>${elAlumno.idiomasAlumno} </strong>

</body>
</html>