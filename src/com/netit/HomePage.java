// � 2022 Anna Vasileva. All rights reserved.

package com.netit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homePage")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomePage() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("/home.html").forward(request, response);
	}

}
