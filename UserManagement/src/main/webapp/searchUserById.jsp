<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.container{
text-align: center;
display: flex;
display: block;
box-shadow: 0 2px 5px rgba(1, 1, 1, 1);
background-color: #f2f2f2;
padding: 20px;
}
}
</style>


<body>
	<div class='container'>
	<h2>Search User</h2>
	<form action="searchUser" method="post">
	<label>User ID</label>
	<input type="number" name="uid"><br/>
	<input type="submit" value="Search User"/>
	<input type="reset" value="reset"/>
	</form>
	<br/>
	${requestScope.msg}
	<br/>
	<a href="index.jsp">Back</a>
	</div>
</body>
</html>