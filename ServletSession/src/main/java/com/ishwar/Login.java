package com.ishwar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String myEmail = req.getParameter("email");
		String myPassword = req.getParameter("password");
		
		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("email");
		String password = (String) session.getAttribute("password");
		
		if(email.equals(myEmail) && password.equals(myPassword)) {
			RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
			rd.forward(req, res);
		}
		else {
			res.getWriter().print("<h3 style='color:red'>Login Failed...!");
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.forward(req, res);
		}		
	}
}
