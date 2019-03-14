/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
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

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
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
