<%-- 
    Document   : IngNueArq
    Created on : 4/10/2018, 10:05:27 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Generar Nuevo Arquitecto</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div style=" position: static; left: 50%; text-align: center">
            <form action="IngRol" method="Post">
            <h1>Registro de Usuario</h1><br><br>
            
                <p>Nombre</p><input type="text" name="Nom"><br><br>
                <p>Apellido Paterno</p><input type="text" name="Ap"><br><br>
                <p>Apellido Materno</p><input type="text" name="Am"><br><br>
                <p>Ingresa el Rol que deseas</p><select name="Rol">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                </select>
                <input type="submit" name="Buscar" value="Buscar"><br><br>
            </form>
            <input type="submit" name="Volver" value="Volver" onclick="window.location.href='index.html'"><br><br>
        </div>
    </body>
</html>
