package com.example;

import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet({"/hello"})
public class HelloAppEngine extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");

		resp.getWriter().print("Hello App Engine!\r\n");
		LocalDateTime instance = LocalDateTime.now();
		resp.getWriter().print("The time is ");
		resp.getWriter().println( instance);
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
public void doGet1(Object req, MockHttpServletResponse response) {
	// TODO Auto-generated method stub
	
}
public void doGet(Object req, MockHttpServletResponse response) {
	// TODO Auto-generated method stub
	
}

}