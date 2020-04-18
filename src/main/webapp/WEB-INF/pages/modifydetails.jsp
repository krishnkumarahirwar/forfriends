<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h1>Trainee after modifying
</h1>
<h1>
Id is  <c:out value="${traine.traineeId}"/><br>
Name is <c:out value="${traine.traineeName}"/><br>
Domain is  <c:out value="${traine.traineeDomain}"/><br>
Location is <c:out value="${traine.traineeLocation}"/>
</h1>
</body>
</html>
