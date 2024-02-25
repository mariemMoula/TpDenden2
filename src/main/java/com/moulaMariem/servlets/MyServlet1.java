package com.moulaMariem.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//This servlet retrieves the value of the parameter "username" from the request and prints it to the response
public class MyServlet1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet1() {
        super();
      
    }

//retrieveing the value of the parameter "username" from the request and prints it to the response.
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		 response.setContentType ("text/html");
	        String name = request.getParameter ("username");
	        PrintWriter out = response.getWriter ();
	        out.println (name);
	}

}
