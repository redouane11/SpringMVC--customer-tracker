package com.redouaneadr.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		// setup connection variables
		
		String user = "springstudent";
		String password = "springstudent";
		
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";

		String driver="com.mysql.jdbc.Driver";

		// get connection to database

		try {

		PrintWriter out=response.getWriter();

		out.println("Connecting to database: "+ jdbcUrl);

		Class.forName(driver);

		Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);

		out.println("SUCCESS!!!");

		myConn.close();

		}

		catch(Exception exc) {

		exc.printStackTrace();

		throw new ServletException(exc);

		}

	}

}