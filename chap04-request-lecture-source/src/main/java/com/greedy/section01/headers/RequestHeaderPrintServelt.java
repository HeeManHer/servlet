package com.greedy.section01.headers;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headers")
public class RequestHeaderPrintServelt extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/* 헤더의 종류
		 * 1. General Header : 요청 및 응답에 모두 적용되지만 바디랑은 관련이 없다.
		 * 2. Request Header
		 * 		: 패치 될 리소스나 클라이언트 자체에 대한 상세 정보를 포함하는 헤더
		 * 3. Response Header
		 * 		: 응댑에 대한 부가적인 정보를 갖는 헤더이다.
		 * 4. Entity Header
		 * 		: 컨텐츠 길이, MIME 타입과 같은 바디에 대한 상세정보를 포함
		 * 		  (요청과 응답에 모두 사용 - GET요청은 해당하지 않는다.)
		 * */

		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			response.getWriter().append("<h1>" + headerNames.nextElement() + "</h1>");
		}

		System.out.println("accept : " + request.getHeader("accept"));
		System.out.println("sccept-encoding : " + request.getHeader("accept-encoding"));
	}
}
