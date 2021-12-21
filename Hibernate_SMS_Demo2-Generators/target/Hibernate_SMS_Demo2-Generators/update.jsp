<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="./update" method="post">
<label for="sid">Student_Id</label>
<input type="text" id="sid" name="sid" placeholder="Enter student id" readonly="readonly" value="${student.sid }"><br><br><br>
<label for="sname">Student_name</label>
<input type="text" id="sname" name="sname" placeholder="Enter student name" value="${student.sname }"><br><br><br><br>
<label for="sfee">Student_sfee</label>
<input type="text" id="sfee" name="sfee" placeholder="enter Student fee" value="${student.sfee }"><br><br><br>
<input type="submit" value="submit">
</form>
</div>

</body>
</html>