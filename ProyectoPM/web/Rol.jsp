<%-- 
    Document   : Rol
    Created on : 5/10/2018, 01:40:36 PM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingresa el Rol</h1>
        <form action="IngRol" method="post">
        <%
            String nom= request.getParameter("Nom");
            String Ap=request.getParameter("Ap");
            String Am= request.getParameter("Am");
            
            out.println("<input type='text' name='Nom' value="+nom+">");
            out.println("<input type='text' name='Ap' value="+Ap+">");
            out.println("<input type='text' name='Am' value="+Am+">");
            
        %>
        
            <select name="Rol">
                <option>1</option>
                <option>2</option>
                <option>3</option>
            </select><br>
            <button>Ok</button>
        </form>
    </body>
</html>
