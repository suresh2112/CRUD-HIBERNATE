<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
padding: 3px;
color: red;
margin-left: 450px;
text-transform: capitalize;
display: none;

}
.sname{
text-transform:capitalize;
}
h1{
color: blue;
text-align: center;
letter-spacing: 2px;
padding: 10px;
border: 2px solid  red;
border-bottom-left-radius:10%;
}


</style>
</head>
<body>
<h1>Student_Data</h1>


<div class="cap">
<link rel="stylesheet" href="css/addStudent.css">
<form action="./add" method="post">
<label for="sid">Student_Id
  <span class="error" id="sid_error">Student id required</span>      </label>

<input type="text" id="sid" name="sid" placeholder="Enter student id"><br><br><br>
<label for="sname">Student_name
 <spanclass="error" id="sname_error" >Student_name required</span>
</label>
<input type="text" id="sname" name="sname" placeholder="Enter student name" class="sname" ><br><br><br><br>
<label for="sfee">Student_sfee
 <span  class="error" id="sfee_error">Student_fee required</span>
</label>
<input type="text" id="sfee" name="sfee" placeholder="enter Student fee"><br><br><br>
<input type="submit" value="submit">
</form>
</div>
</body>
</html>