package com.ishwar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ServletAttributes extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		if("ishwar@gmail.com".equals(email) && "1234".equals(password)) {
				
			req.setAttribute("email", email);
			req.setAttribute("password", password);
			
			RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
			rd.forward(req, res);
		}
		else {
			res.setContentType("text/html");
			out.print("<h3 style=\"color:red\">Login Failed Details Incorrect...!</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
		
		
	}
}
