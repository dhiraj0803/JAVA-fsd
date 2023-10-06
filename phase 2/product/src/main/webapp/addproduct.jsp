<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Addproduct" method="post">
        <label for="name">Product Name:</label>
        <input type="text" name="name" required><br>
        
        <label for="description">Description:</label>
        <textarea name="description" required></textarea><br>
        
        <label for="price">Price:</label>
        <input type="number" step="0.01" name="price" required><br>
        
        <input type="submit" value="Add Product">
    </form>

</body>
</html>