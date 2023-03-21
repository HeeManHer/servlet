package com.greedy.section01.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ReciveInfomationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		System.out.println("userId : " + id);
		System.out.println("Password : " + pass);

		request.setAttribute("id", id);
		request.setAttribute("pass", pass);

		RequestDispatcher rd = request.getRequestDispatcher("print");
		rd.forward(request, response);
	}

}
