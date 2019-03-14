<%-- 
    Document   : index
    Created on : 13-mar-2019, 14:49:41
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
        <div class="row justify-content-center">
        <h1>Ingreso-Consumiendo Servicio-</h1>
         </div>
        <form  action="SLogin" method="POST">
            <table>    
                <tbody>  
                    <div class="form-group">
                        <labe>DNI</labe>
                        <input type="text" name="txtDni" value="" />
                    </div>
                    <div class="form-group">
                        <label>NIVEL DE USUARIO</label>
                        <select name="cboNiveles">
                                <option value="1">V.I.P</option>
                                <option value="2">PREMIUN</option>
                                <option value="3">BASIC</option>
                            </select>
                    </div>
                    <div class="form-group">
                         <input type="submit" class="btn btn-primary" value="Login" name="btnLogin"  />
                    </div>
                </tbody>
            </table>
        </form>
       
    </body>
</html>
