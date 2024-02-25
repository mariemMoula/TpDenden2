package com.moulaMariem.wrappers;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestWrapper;
//This class is a custom wrapper for the request object. It overrides the getParameter method to modify the behavior of retrieving request parameters.
public class RequestWrapper1 extends ServletRequestWrapper {
	// is a custom wrapper class for the request object.
	 public RequestWrapper1 (ServletRequest req)
	    {
	        //calls the ServletRequestWrapper superclass's constructor i.e. ServletRequest.
	        super (req);
	    }
// overriding the getParameter method to modify the behavior of retrieving request parameters.
	    public String getParameter (String str)
	    {
	        //Calling the superclass method : ServletRequest's getParameter(String) method.
	        String name = super.getParameter (str);
	        //If the parameter is empty, it sets a default value indicating that the user should enter their name.
	        if (name.equals (""))
	        {
	         name = "Please, enter your name in the form";
	        }
	        return name;
	    }
}
