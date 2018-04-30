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

<h1>${cartItem.product.name}</h1>
<p>${cartItem.quantity}</p>
<p>${cartItem.product.price}</p>

</body>
</html>
