package guestbook.controller;

import java.io.IOException;
import java.util.List;

import guestbook.dao.GuestbookDao;
import guestbook.vo.GuestbookVo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gb")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("a");
		if("list".equals(action)) {
			
		} else if("add".equals(action)) {
			List<GuestbookVo> list = new GuestbookDao().findAll();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
