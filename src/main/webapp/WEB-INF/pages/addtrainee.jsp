<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<form method="get" action="processaddtrainee">

<div>
<label> ID </label>
<input type="number" name="traineeId">
<label> Name </label>
<input type="text" name="traineeName">
<label> domain </label>
<input type="text" name="traineeDomain">
<label> Location </label>
<input type="text" name="traineeLocation">
</div>

<input type="submit" value="Find">

</form>
</body>
</html>
