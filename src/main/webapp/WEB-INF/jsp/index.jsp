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
	<span><c:out value="${trainer.getName()}" /></span>
	<br />
	<br />
	<form:form action="event" method="post" modelAttribute="pokemon">
		<span>Nombre Pokemon:</span>
		<form:input type="text" path="name" />
		<span>Vida:</span>
		<form:input type="text" path="health" />
		<span>Daño:</span>
		<form:input type="text" path="attack" />
		<input name="capture" type="submit" value="Lanzar pokeball" />
	</form:form>
	<br />
	<span>Equipo: </span>
	<table>
		<thead>
			<th>Nombre</th>
			<th>Vida</th>
			<th>Daño</th>
			<th>Pokemon activo</th>
		</thead>

		<c:forEach items="${trainer.getPokemons()}" var="pokemon">
			<tr>
				<td>${pokemon.name}</td>
				<td>${pokemon.health}</td>
				<td>${pokemon.attack}</td>
				<td><c:out value="${pokemon.currentFighter}" /></td>
				<td><form:form action="changePokemon${pokemon.name}"
						method="post" modelAttribute="pokemon">
						<input type="submit" value="Cambiar pokemon"></input>
					</form:form></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<br />
	<span>Pokemons capturados: </span>
	<table>
		<thead>
			<th>Nombre</th>
			<th>Vida</th>
			<th>Daño</th>
		</thead>

		<c:forEach items="${trainer.getPokemons_captured()}" var="pokemon">
			<tr>
				<td>${pokemon.name}</td>
				<td>${pokemon.health}</td>
				<td>${pokemon.attack}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>