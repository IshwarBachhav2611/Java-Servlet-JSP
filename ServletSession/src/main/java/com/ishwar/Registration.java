package com.ishwar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Registration extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name = req.getParameter("name");
		String contact = req.getParameter("contact");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("contact", contact);
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		
		res.getWriter().print("<h3 style='color:red'>Registration successfull...!");
		RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
		rd.forward(req,res);
		
	}
}
