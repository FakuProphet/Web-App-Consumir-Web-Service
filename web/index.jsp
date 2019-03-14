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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingreso-Consumiendo Servicio-</h1>
        <form action="SComprobarLogin" method="POST">
            <table>    
                <tbody>  
                    <tr>
                        <td>Dni</td>
                        <td><input type="text" name="txtDni" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nivel</td>
                        <td><select name="cboNiveles">
                                <option value="1">V.I.P</option>
                                <option value="2">PREMIUN</option>
                                <option value="3">BASIC</option>
                            </select></td>
                    </tr>
                     <tr>
                         <td><input type="submit" value="Login" name="btnLogin" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
