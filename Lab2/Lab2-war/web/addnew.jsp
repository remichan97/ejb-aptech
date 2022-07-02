<%-- 
    Document   : addnew
    Created on : 2 Jul 2022, 20:20:36
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

        <form action="AddNewServlet">
            Roll: <input type="text" name="txtRoll">
            Student name: <input type="text" name="txtName">
            Class: <input type="text" name="txtClass">
            
            <input type="submit">
        </form>
    </body>
</html>

