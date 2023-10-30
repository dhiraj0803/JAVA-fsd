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
	${requestScope.msg}
	<h2>Update User</h2>
	<form action="updateUser" method="post">
	<label>User ID</label>
	<input type="number" name="uid"><br/>
	<label>Email</label>
	<input type="email" name="email"><br/>
	<input type="submit" value="Update User"/>
	<input type="reset" value="reset"/>
	</form>
	<br/>
	<a href="index.jsp">Back</a>
</div>>
</body>
</html>