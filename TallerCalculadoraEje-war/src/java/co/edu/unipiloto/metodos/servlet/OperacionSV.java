/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.servlet;

import co.edu.unipiloto.metodos.session.CalBin;
import co.edu.unipiloto.metodos.session.CalBinLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
@WebServlet(name = "OperacionSV", urlPatterns = {"/OperacionSV"})
public class OperacionSV extends HttpServlet {

    @EJB
    private CalBinLocal calcBin;

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

        int val1, val2;
        val1 = Integer.parseInt(request.getParameter("val1"));
        val2 = Integer.parseInt(request.getParameter("val2"));
        String ope = request.getParameter("ope");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            switch (ope) {
                case "suma":
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Su Suma es: " + calcBin.suma(val1, val2) + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                    break;
                case "resta":
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Su Resta es: " + calcBin.resta(val1, val2) + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                    break;
                case "multiplicacion":
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Su Multiplicacion es: " + calcBin.multiplicacion(val1, val2) + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                    break;
                case "dividir":
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Su Division es: " + calcBin.Division(val1, val2) + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                    break;
                case "modulo":
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>El Modulo es: " + calcBin.modulo(val1, val2) + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                    break;
                    case "elevar al cuadrado":
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Calculadora</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>El numero al cuadrado es: " + calcBin.cuadrado(val1, val2) + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                    break;
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
