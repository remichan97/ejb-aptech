<%-- 
    Document   : edit
    Created on : 2 Jul 2022, 20:20:24
    Author     : Mirai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="SinhVienServlet">Return</a>

        <form action="Update">
            Roll: <input type="text" name="txtRoll" value="${sv.rollId}" readonly>
            Student name: <input type="text" name="txtName" value="${sv.fullName}">
            Class: <input type="text" name="txtClass" value="${sv.className}">
            
            <input type="submit">
        </form>
    </body>
</html>
