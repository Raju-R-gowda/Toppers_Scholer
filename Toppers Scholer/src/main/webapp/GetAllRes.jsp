<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Education</th>
	<th>Course</th>
	<th>Course_fee</th>
</tr>
<c:forEach var="xx" items="${get}">
<tr>
	<td>${xx.id}</td>
	<td>${xx.name}</td>
	<td>${xx.education}</td>
	<td>${xx.course}</td>
	<td>${xx.course_fee}</td>
</tr>
</c:forEach>
</table>

</body>
</html>