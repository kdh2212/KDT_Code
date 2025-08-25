package com.du;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlloer
 */
@WebServlet("/")
public class Controlloer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlloer() {
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
		
		if(com.equals("/") || com.equals("/main")) {
			String email = request.getParameter("email");
			String check = request.getParameter("check");
			
			if( "on".equals(check)) { // 현재 check가 null이기 떄문에 오류가 발생 그래서 on과 check의 위치를 바꿈 &&를 사용해서 null을 해결하는 방법도 있다.
				// 쿠키에 저장
				Cookie cookie = new Cookie("email", email);
//				cookie.setMaxAge(30); // 30초 동안 쿠키를 저장한다고 생각 30초 이전까지는 쿠키의 저장한 값을 저장한는데 그 이후는 없어진다.
				cookie.setMaxAge(-1); // -1은 브라우저가 종료되면 바로 없어진다. 
				response.addCookie(cookie);
				
			} else {
				// 쿠키 삭제
				Cookie cookie = new Cookie("email", null); // null로 해야한다.
			    cookie.setMaxAge(0);         // 0으로 해야한다.  
			    response.addCookie(cookie); // addCookie를 해야지 브러우저로 들어간다.
			}
			
			view = "redirect: remember.jsp";
		
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
