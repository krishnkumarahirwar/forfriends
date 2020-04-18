<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h4>trainee has been deleted</h4>
<h1>
Id is  <c:out value="${trainee.traineeId}"/>
Name is <c:out value="${trainee.traineeName}"/>
Domain is  <c:out value="${trainee.traineeDomain}"/>
Location is <c:out value="${trainee.traineeLocation}"/>
</h1>
</body>
</html>