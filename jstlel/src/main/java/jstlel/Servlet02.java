package jstlel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/02")
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. 객체의 scopt(존속범위)
		 *    객체의 존재 범위
		 *    
		 * 2. 객체가 오래 존속하는 순서
		 * Application(context) sccpe > Session Secope > Request Score > Page Scope
		 * 
		 * 4. 객체가 오래 존속하는 순서
		 * Application(context) sccpe < Session Secope < Request Score < Page Scope
		 * */
		
		// application scope
		UserVo vo1 = new UserVo();
		vo1.setId(1L);
		vo1.setName("둘리1");
		request.getServletContext().setAttribute("vo", vo1);
		
		// session scope
		UserVo vo2 = new UserVo();
		vo2.setId(2L);
		vo2.setName("둘리2");
		request.getSession().setAttribute("vo", vo2);
		
		//request scope
		UserVo vo3 = new UserVo();
		vo3.setId(3L);
		vo3.setName("둘리3");
		request.setAttribute("vo", vo3);
		
		request.getRequestDispatcher("/WEB-INF/views/02.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
