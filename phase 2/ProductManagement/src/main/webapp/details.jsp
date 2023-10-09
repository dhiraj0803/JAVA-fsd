<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.entities.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<h2>Product Details:</h2>
    <%
    	Product product = (Product) session.getAttribute("product");
        if (product != null) {
    %>
            <p>Name: <%= product.getName() %></p>
            <p>Description: <%= product.getDescription() %></p>
            <p>Price: <%= product.getPrice() %></p>
    <%
        } else {
    %>
            <p>No product details available.</p>
    <%
        }
    %>


</body>
</html>