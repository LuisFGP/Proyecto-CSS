<%-- 
    Document   : Reg
    Created on : 4/10/2018, 10:05:27 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div style=" position: static; left: 50%; text-align: center">
            <form action="Registro" method="Post">
            <h1>Registro de Usuario</h1><br><br>
            
                <p>Nombre</p><input type="text" name="Nom"><br><br>
                <p>Apellido Paterno</p><input type="text" name="Ap"><br><br>
                <p>Apellido Materno</p><input type="text" name="Am"><br><br>
                <p>Telefono</p><input type="text" name="Tel"><br><br>
                <p>Correo</p><input type="text" name="Cor"><br><br>
                <p>Usuario</p><input type="text" name="Usu"><br><br>
                <p>Contraseña</p><input type="text" name="Con"><br><br>

                <input type="submit" name="Ok" value="Aceptar"><br><br>
            </form>
            <input type="submit" name="Volver" value="Volver" onclick="window.location.href='index.html'"><br><br>
        </div>
    </body>
</html>