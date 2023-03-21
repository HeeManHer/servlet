package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uid = request.getParameter("id");
		String password = request.getParameter("ps");
		String name = request.getParameter("name");

		String res = "<html>";
		res += "<h3>";
		res += "User ID : " + uid;
		res += "</h3>";
		res += "<h3>";
		res += "Password : " + password;
		res += "</h3>";
		res += "<h3>";
		res += "Name : " + name;
		res += "</h3>";
		res += "</html>";

		response.getWriter().append(res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
