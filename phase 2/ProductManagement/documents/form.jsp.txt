<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<form action="ProductServlet" method="post">
		Name : <input type="text" name="name"><br>
		Description: <textarea name="description"></textarea><br>
		Price: <input type="text" name="price"><br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>