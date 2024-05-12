<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Electronic product catalog</title>
</head>

<body>
	<h2>Categories</h2>
	<ul>
		<c:forEach var="element" items="${elements}">
			<li>
				<form action="" method="post">
					<a href="">
						<c:out value="${element.getName()}"></c:out>
					</a>
					<br>
					<input type="hidden" name="class" value='${element.getClass().getName()}'/>
					<input type="hidden" name="id" value="${element.getId()}"/>
					<input type="submit" value="Change"/>
				</form>
			</li>
		</c:forEach>
	</ul>	

</body>
</html>