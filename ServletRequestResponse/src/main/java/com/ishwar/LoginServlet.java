package com.ishwar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println("Login Successfull...!");
		System.out.println("Email :"+email);
		System.out.println("Password :"+password);
		
		PrintWriter out = res.getWriter();
		out.println("Login Successfull...!");
		out.println("Email :"+email);
		out.println("Password :"+password);
		
	}

}
