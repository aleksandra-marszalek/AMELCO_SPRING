<%--
  Created by IntelliJ IDEA.
  User: janmadej
  Date: 26.04.2018
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/addedtocart" method="post">
    Product name: <input type = "text" name = "productName">
    <br />
    quantity: <input type = "number" name="quantity">
    <br />
    Product price: <input type = "number" name = "productPrice">
    <br />
    <input type = "submit" value = "Submit" />

</form>
<a href="/cart">Go to cart</a>

</body>
</html>
