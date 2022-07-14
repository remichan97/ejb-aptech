<%-- 
    Document   : viewall
    Created on : 12 Jul 2022, 19:48:53
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
        <a href="addnew.jsp">Add new</a>
        <table style="border: thin solid black">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Author</th>
                <th>Price</th>
                <th>Category</th>
                <th>Description</th>
                <th>Detail</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${sachList}" var="sach">
                <td>${sach.isbn}</td>
                <td>${sach.bookName}</td>
                <td>${sach.author}</td>
                <td>${sach.price}</td>
                <td>${sach.danhMucId.name}</td>
                <td><a href="Detail?isbn=${sach.isbn}">Detail</a></td>
                <td><a href="ChuanBiUpdate?isbn=${sach.isbn}">Update</a></td>
                <td><a href="Delete?isbn=${sach.isbn}" onclick="return confirm('Would you like to delete this book?')">Delete</a></td>
            </c:forEach>
        </table>
    </body>
</html>