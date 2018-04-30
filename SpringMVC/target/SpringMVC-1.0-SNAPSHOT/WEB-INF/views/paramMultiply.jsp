<%--
  Created by IntelliJ IDEA.
  User: janmadej
  Date: 26.04.2018
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>param multiply</title>

    <style>
        tr:nth-of-type(2n) {
            background: lightgray;
        }
    </style>

</head>
<body>
<table>
    <tr>
        <c:forEach begin="0" end="${cols}" var="j">
            <c:if test="${j==0}">
                <th>x</th>
            </c:if>
            <c:if test="${j!=0}">
                <th>${j}</th>
            </c:if>
        </c:forEach>
    </tr>

    <c:forEach begin="1" end="${rows}" var="i">
        <tr>
            <th>${i}</th>
            <c:forEach begin="1" end="${cols}" var="j">
                <td>${i*j}</td>
            </c:forEach>
        </tr>
    </c:forEach>

</table>

</body>
</html>
