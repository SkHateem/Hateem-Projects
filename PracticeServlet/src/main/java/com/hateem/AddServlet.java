package com.hateem;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;

@WebServlet("add")
public class AddServlet extends HttpServlet
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
   {
	PrintWriter out=res.getWriter();
	   int i= Integer.parseInt(req.getParameter("n1"));
	   int j= Integer.parseInt(req.getParameter("n2"));
	   int k = i+j;
	   out.println(k);
   }
}
