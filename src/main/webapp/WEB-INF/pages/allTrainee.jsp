<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<% List elist=(List)session.getAttribute("findAll",trainee);%>
<html>
<h1>trainee-List</h1>
<body>
<h1>
<table>
<%=eList%>
<c:forEach items="${eList}" var="trainee"> 
<tr>
	<td>Id is  <c:out value="${trainee.traineeId}"/></td>
	<td>Name is <c:out value="${trainee.traineeName}"/></td>
	<td>Domain is  <c:out value="${trainee.traineeDomain}"/></td>
	<td>Location is <c:out value="${trainee.traineeLocation}"/></td>
</tr>
</c:forEach>
</table>
</h1>
</body>
</html>
