package com.greedy.section01.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class PrintLoginInfomationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("print servlet 호출");

		String id = (String) request.getAttribute("id");
		String pass = (String) request.getAttribute("pass");

		System.out.println("forward된 id : " + id);
		System.out.println("forward된 password : " + pass);

		StringBuilder responseText = new StringBuilder();
		responseText.append("<!doctype html>\n");
		responseText.append("<html>\n");
		responseText.append("<header>\n");
		responseText.append("</header>\n");
		responseText.append("<body>\n");
		responseText.append("<h3 align=\"center\">");
		responseText.append(id);
		responseText.append("님 환영합니다.</h3>\n");
		responseText.append("</body>\n");
		responseText.append("</html>\n");

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.print(responseText.toString());
		out.flush();
		out.close();
	}

}
