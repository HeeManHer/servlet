package com.greedy.section01.othersite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/othersite")
public class OtherSiteRedirectServelt extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("get 요청 후 naver 사이트로 redirect");

		response.sendRedirect("http://www.naver.com");
	}
}
