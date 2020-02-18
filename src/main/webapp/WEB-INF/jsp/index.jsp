<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Inicio de la aplicacion</title>
</head>
<body>
	<form:form action="insert" method="post" modelAttribute="trainer">
		<span>Nombre del entrenador:</span>
		<form:input type="text" path="name" />
		<input type="submit" value="Guardar nombre entrenador" />
	</form:form>
	<br /> El nombre del entrenador es
	<span><c:out value="${trainer.name}" /></span>
	<br />
	<form:form action="insertPokemon" method="post" modelAttribute="trainer">
		<span>Pokemon para el entrenador:</span>
		<form:input type="text" path="name" />
		<input type="submit" value="Guardar Pokemon" />
	</form:form>
	
	<c:if test="${not empty ListPokemons}">
		<table>
			<thead>
				<th>Nombre</th>
				<th>Vida</th>
				<th>Daño</th>
			</thead>

			<c:forEach items="${ListPokemons}" var="pokemon">
				<tr>
					<td>${pokemon.name}</td>
					<td>${pokemon.health}</td>
					<td>${pokemon.attack}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>