package com.du;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/")) {
			request.setAttribute("aaa", LocalDateTime.now());
			view = "main.jsp"; // 데이터를 넘겨줄꺼면 , 포워딩, 장점 view의 이름이 안나온다.
//			view = "redirect:main.jsp"; // 데이터를 안넘겨줄꺼면
		}else if(com.equals("/b")) {
			// main.jsp 에 val2의 값을 val에 들어가게하라.
			String val2 = request.getParameter("val2");
			request.setAttribute("val", val2);
			view = "main.jsp";
		}else if(com.equals("/c")) {
			// text의 값을 받아오는
			String str = request.getParameter("nn");
			// 콘솔창에 받은 값을 찍을 수 있다. 에러를 찾을 때 용이
//			System.out.println(str);
			
			// n2에 str 값이 들어가게
			request.setAttribute("res",str); // res라는 곳에 str값을 넣는다.
			view = "main.jsp";
		}
		
		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
