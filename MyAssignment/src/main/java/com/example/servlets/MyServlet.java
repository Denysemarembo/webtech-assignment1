package com.example.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("Denyse".equals(username) && "password".equals(password)) {

       	response.sendRedirect("/MyAssignment/home.html"); 
        } else {
           
            response.sendRedirect("/MyAssignment/Forgotpassword.html"); 
        }

	}

}
