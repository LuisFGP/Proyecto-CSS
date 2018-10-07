/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luis Garcia
 */
@WebServlet(name = "Verificar", urlPatterns = {"/Verificar"})
public class Verificar extends HttpServlet {

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
        HttpSession sesion = request.getSession();
        String Usua=(String)sesion.getAttribute("Usuario");
        String c=(String)sesion.getAttribute("contra");
        String rol=(String)sesion.getAttribute("Rol");
        
        if(rol.equals("1")){
            PrintWriter out = response.getWriter();
            out.println("<html><head></head><body>");
            out.println("<style type='text/css'> @import url('Estilos/style2.css')</style>");
            out.println("Bienvenid@ "+ Usua + " eres admin<br>");
            out.println("<form action='LisRol' method='Post'>");
            out.println("<a href=\"/ProyectoPM/GenNuPro.jsp\"> Generar Nuevo Proyecto</a><br>");
            out.println("<a href=\"/ProyectoPM/Proyectos.jsp\"> Proyectos</a><br>");
            out.println("<a href=\"/ProyectoPM/Calculos.jsp\"> Calculos</a><br>");
            out.println("<a href=\"/ProyectoPM/Simulacion.jsp\"> Simulacion</a><br>");
            out.println("<a href=\"/ProyectoPM/IngNueArq.jsp\"> Ingresar nuevo Arquitecto</a><br>");
            out.println("<button> Lista de Usuarios sin Rol</button><br>");
            out.println("<a href=\"/ProyectoPM/index.html\"> Volver</a></form>");
            out.println("<br>");
            out.println("<br></body></html>");
        }
        else{
            if(rol.equals("2")){
                PrintWriter out = response.getWriter();
                out.println("<html><head></head><body>");
                out.println("<style type='text/css'> @import url('Estilos/style2.css')</style>");
                out.println("Bienvenid@ "+Usua+ " eres Arquitecto");
                out.println("<a href=\"/ProyectoPM/Proyectos.jsp\"> Proyectos</a><br>");
                out.println("<a href=\"/ProyectoPM/Calculos.jsp\"> Calculos</a><br>");
                out.println("<a href=\"/ProyectoPM/Simulacion.jsp\"> Simulacion</a><br>");
                out.println("<a href=\"/ProyectoPM/index.html\"> Volver</a>");
                out.println("<br>");
                out.println("<br></body></html>");
            }
            else{
                if(rol.equals("3") || rol.equals("0")){
                    PrintWriter out = response.getWriter();
                    out.println("<html><head></head><body>");
                    out.println("<style type='text/css'> @import url('Estilos/style2.css')</style>");
                    out.println("Bienvenid@ "+Usua+ " eres Visitante");
                    out.println("<a href=\"/ProyectoPM/Calculos.jsp\"> Calculos</a><br>");
                    out.println("<a href=\"/ProyectoPM/Simulacion.jsp\"> Simulacion</a><br>");
                    out.println("<a href=\"/ProyectoPM/index.html\"> Volver</a>");
                    out.println("<br>");
                    out.println("<br></body></html>");
                }
                
                
            }
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
