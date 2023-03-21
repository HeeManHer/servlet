package com.greedy.section03.status;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.sendError(403, "너는 이 페이지를 사용할 자격이 없다.");
		response.sendError(500, "서버 내부 오류 입니다. 서버 오류는 개발자의 잘못이고, 개발자는 너다.");

	}

}
