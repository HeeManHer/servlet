package com.greedy.section01.exception;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show500error")
public class Show500ErrorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(500, "네놈이 잘못하고 왜 내게 따지느냐. 네놈의 잘못은 네놈이 고쳐야 할 것이야");
	}

}
