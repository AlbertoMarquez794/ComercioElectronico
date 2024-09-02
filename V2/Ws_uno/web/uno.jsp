<%-- 
    Document   : uno
    Created on : 21/08/2024, 01:59:10 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina que ejecuta las sumas</title>
    </head>
    <body>
        <%
            
            String strA, strB;
            int a,b,c;
            strA = request.getParameter("opA");
            strB = request.getParameter("opB");
            a = Integer.parseInt(strA);
            b = Integer.parseInt(strB);
            c = a + b;
        %>
        <%="La suma de " + strA + " + " + strB + " es " + c%>
    </body>
</html>
