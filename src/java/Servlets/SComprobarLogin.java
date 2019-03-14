/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.Usuario;
import webservices.WebServiceGestionUsuario_Service;

/**
 *
 * @author Prophet
 */
public class SComprobarLogin extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSUsuariosSistema/WebServiceGestionUsuario.wsdl")
    private WebServiceGestionUsuario_Service service;

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
       
        
        /*Obteniendo valores por parametro*/
        String nroDni = request.getParameter("txtDni");
        String nivelID = request.getParameter("cboNiveles");
        
        Usuario nuevo = validarLogin(Integer.parseInt(nroDni),Integer.parseInt(nivelID));
        
        if(nuevo!=null)
        {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuarioLogueado",nuevo);
            response.sendRedirect("paginaUsuario.jsp");
        }
        else
        {
             response.sendRedirect("index.jsp");
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

    private Usuario validarLogin(int dni, int nivelID) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WebServiceGestionUsuario port = service.getWebServiceGestionUsuarioPort();
        return port.validarLogin(dni, nivelID);
    }

}
