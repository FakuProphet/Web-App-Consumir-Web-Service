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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario logueado:<jsp:getProperty name="usuarioLogueado" property="apellido" /></h1>
        <jsp:useBean id="usuarioLogueado" scope="session" class="webservices.Usuario" />
        
        <h1>Registrar nuevo usuario</h1>

       

        <form name="contact-form" action="" method="post">

            <div class="form-group">
                <label for="nombre">Nombre</label>
                <input name="nombre" type="text" class="form-control"
                       placeholder="Nombre...">
            </div>

            <div class="form-group">
                <label for="apellido">Apellido</label>
                <input name="apellido" type="text" class="form-control"
                       placeholder="Apellido...">
            </div>

            <div class="form-group">
                <label for="NroDocumento">Nro Documento</label>
                <input name="NroDocumento" type="text" class="form-control"
                       placeholder="Nro dni...">
            </div>
            <div class="form-group">
                <label for="Password">Password</label>
                <input name="password" type="text" class="form-control"
                       placeholder="Password">
            </div>
            <input name="submit" type="submit"
                   class="btn btn-primary" value="Registrar">
        </form>
    </body>
</html>
