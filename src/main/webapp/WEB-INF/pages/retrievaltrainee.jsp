<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h1>search trainee details
</h1>
<h1>
Id is  <c:out value="${trainee.traineeId}"/><br>
Name is <c:out value="${trainee.traineeName}"/><br>
Domain is  <c:out value="${trainee.traineeDomain}"/><br>
Location is <c:out value="${trainee.traineeLocation}"/>
</h1>
</body>
</html>
