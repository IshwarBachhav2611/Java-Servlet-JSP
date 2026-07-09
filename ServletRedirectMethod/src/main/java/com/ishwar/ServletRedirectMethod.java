package com.ishwar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class ServletRedirectMethod extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String value = req.getParameter("searchbox");
		
		res.sendRedirect("https://www.google.com/search?q="+value);
	}
}
