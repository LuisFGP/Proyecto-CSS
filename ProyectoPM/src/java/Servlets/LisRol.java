/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class LisRol extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
        try{
            String url;
            String User;
            String Pass;
            String Nom;
            String Ap;
            String Am;
            Connection con;
            Statement sta;
            ResultSet res;
            
            url="jdbc:mysql://localhost/Usuarios";
            User="root";
            Pass="n0m3l0";
        
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where idrol=3;");
            while(res.next()){
                Nom=res.getString("Nom");
                Ap=res.getString("ApeM");
                Am=res.getString("ApeP");
                
                out.println("<html>");
                out.println("<head>");
                out.println("<style type='text/css'> @import url('Estilos/style2.css')</style>");
                out.println("<title>Servlet IngRol</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<form action='Rol.jsp' method='Post'");
                out.println("<input type='text' value="+Nom+" disabled>");
                out.println("<input type='text' value="+Ap+" disabled>");
                out.println("<input type='text' value="+Am+" disabled>");
                out.println("<button>Validar Rol<button><br>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>"); 
                
            }

        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            out.println("<a href=\"/ProyectoPM/index.html\">Volver</a><br>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
