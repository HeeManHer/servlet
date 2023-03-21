package com.greedy.section01.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/* 서블릿이 하는 역할은 크게 3가지로 볼 수 있다.
		 * 1. 요청 받기 - request객체 이용
		 * 		- parameter를 꺼내올 수 있다.
		 * 2. 비지니스 로직 처리
		 * 		- 서비스 호출(MVC)
		 * 3. 응답하기 - response객체 이용
		 * 		- 문자열로 동적인 웨페이지를 만들어서 스트림을 이용해 내보내기
		 * */

		StringBuilder responseBulider = new StringBuilder();

		responseBulider.append("<!dictype html>\n");
		responseBulider.append("<html>\n");
		responseBulider.append("<head>\n");
		responseBulider.append("</head>\n");
		responseBulider.append("<body>\n");
		responseBulider.append("<h1>안녕 Servlet Response</h1>\n");
		responseBulider.append("</body>\n");
		responseBulider.append("</html>\n");

		/* content=type 헤더의 값은 null이 기본 값이다. (text/plain) */
		System.out.println("default response type : " + response.getContentType());

		// response.setContentType("text/html; charset=UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		out.print(responseBulider.toString());
		out.flush();
		out.close();
	}

}
