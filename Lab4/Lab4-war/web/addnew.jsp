<%-- 
    Document   : update
    Created on : 12 Jul 2022, 20:07:06
    Author     : Mirai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Update">
            ISBN: <input type="text" name="txtId" readonly="readonly"><br />
            Name: <input type="text" name="txtName""><br />
            Price: <input type="text" name="txtPrice"><br />
            Author: <input type="text" name="txtAuthor"><br />
            Description: <textarea name="txtDesc"></textarea>><br />
            Category:
            <select name="selCat">
                <c:forEach items="${danhMuc}" var="danhMuc">
                    <option value="${danhMuc.id}" selected="">${danhMuc.name}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Add">
            <a href="ViewAll">Return</a>
        </form>
    </body>
</html>
