package com.ishwar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ServletRequestDispatcher extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		if (req.getParameter("email") == null &&
		        req.getParameter("password") == null) {

		        RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
		        rd.forward(req, res);
		        return;
		}
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if("ishwar@gmail.com".equals(email) && "1234".equals(password)){
			RequestDispatcher rd =  req.getRequestDispatcher("/success.html");
			rd.forward(req, res);
		}
		else{
			RequestDispatcher rd = req.getRequestDispatcher("/failed.html");
			rd.forward(req, res);				
		}
	}
}
