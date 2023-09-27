/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class HomeServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("name");
         List<String> list ;
         HttpSession session = request.getSession();
         if(session.getAttribute("names")==null)
         {
             list = new ArrayList<>();
         }else{
             list = (List<String>) session.getAttribute("names");
         }
         list.add(name);
         session.setAttribute("names", list);
         if(list.size() >5){
         session.removeAttribute("names");
         //them o day ne
         }
         request.getRequestDispatcher("login.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
