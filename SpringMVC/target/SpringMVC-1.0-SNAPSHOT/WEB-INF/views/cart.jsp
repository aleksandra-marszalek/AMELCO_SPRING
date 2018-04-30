<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: janmadej
  Date: 26.04.2018
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${cart.cartItems}" var="cartItem">
        <li><%@ include file="addToCart.jsp"%></li>
    </c:forEach>
</ul>

</body>
</html>
