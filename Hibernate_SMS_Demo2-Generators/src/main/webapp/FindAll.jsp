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
<h1 class="sh" position="fixed">Student_Data</h1>
<body class="b";>
<link rel="stylesheet" href="css/style.css">
<div>
<div class="img1"><img alt="flo" src="https://www.creatrixcampus.com/sites/default/files/styles/image_1200x700/public/2019-08/SIS-banner.jpg?itok=i7oMuFAI" 
align="left" width="300px" height="300px" border="3px blue" ></img></div>


<table class="t1" border="3px">

<tr>
<th>Student_ID</th>
<th>Student_Name</th>
<th>Student_Fee</th>
<th>Student_update</th>
<th>Delete</th>

</tr>

<c:forEach items="${students }" var="student">
<tr>
<td><c:out value="${student.sid }"></c:out></td>
<td><c:out value="${student.sname }"></c:out>


</td>
<td><c:out value="${student.sfee }"></c:out>
<td><a href="./update?sid=${student.sid }">update</a></td>
<td><a href="./DeleteC?sid=${student.sid }">delete</a></td>
</tr>
</c:forEach>

</table>
</div>
</body>
</html>