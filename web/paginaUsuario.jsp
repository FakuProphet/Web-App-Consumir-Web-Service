<%-- 
    Document   : paginaUsuario
    Created on : 13-mar-2019, 21:23:26
    Author     : Prophet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario logueado:</h1>
        <jsp:useBean id="usuarioLogueado" scope="session" class="webservices.Usuario" />
        <jsp:getProperty name="usuarioLogueado" property="apellido" />
    </body>
</html>
