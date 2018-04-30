<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${cart.cartItems}" var="cartItem" varStatus="index">
        <li>
            <h3>product name: ${cartItem.product.name}</h3>
            <p>quantity: ${cartItem.quantity}</p>
            <a href="/removeOne?id=${index.count}">Lower quantity by 1 &nbsp;</a>
            <a href="/addMore?id=${index.count}">Add 1 more product &nbsp;</a>
            <p>price: ${cartItem.product.price}</p>
            <a href="/removecart?id=${index.count}">remove product</a>
        </li>
    </c:forEach>
</ul>

</body>
</html>
