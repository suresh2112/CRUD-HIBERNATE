<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<table>

<tr>
<th>Student_ID</th>
<th>Student_Name</th>
<th>Student_Fee</th>
</tr>
<c:forEach items="${students }" var="student">
<tr>
<td><c:out value="${student.sid }"></c:out></td>
<td><c:out value="${student.sname }"></c:out></td>
<td><c:out value="${student.sfee }"></c:out>
</tr>
</c:forEach>

</table>
</div>
</body>
</html>