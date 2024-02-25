package com.moulaMariem.filters;

import java.io.IOException;
import java.io.PrintWriter;

import com.moulaMariem.wrappers.RequestWrapper1;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

/**
 * This filter intercepts requests before they reach MyServlet1.
 *  It prints a message indicating that the request is being filtered, creates an instance of RequestWrapper1, and then passes the request to the next filter or servlet in the chain
 */
public class MyFilter1 extends HttpFilter implements Filter {
  
    public MyFilter1() {
        super();
   
    }


	public void destroy() {
	
	}
	 //This method is called each time a client requests for a web resource i.e. preprocessing request
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
        //It creates an instance of RequestWrapper1 and passes the request to the next filter or servlet in the chain.
        //Calling the constructor of request wrapper class 
        RequestWrapper1 requestWrapper = new RequestWrapper1 (request);
        //This method calls the next filter in the chain
        
		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
