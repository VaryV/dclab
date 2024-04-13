<%-- 
    Document   : add
    Created on : 13 Apr, 2024, 7:39:12 AM
    Author     : clump
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            a <input type="text" name="a">
            b <input type="text" name="b">
            Submit <input type="submit" name="s">
        </form>
        
        <p>${output}</p>
    </body>
</html>
