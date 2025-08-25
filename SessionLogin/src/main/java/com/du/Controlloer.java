package com.du;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

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
		
		HttpSession session = request.getSession(); // 세션이 없으면 새로만들어주고 세션이 있으면 가져와 준다. false를 주면 만들지 않는다.있는것만 가져온다.
		if(com.equals("/") || com.equals("/main")) {
			String userId = (String)session.getAttribute("userId");
		    if(userId != null) {
		    	request.setAttribute("userId", userId);
		    	view = "loginOK.jsp";
		    }else {
		    	view = "redirect:login_main.jsp";
		    }
			
			
		}else if(com.equals("/login")) {
			String id = request.getParameter("id");
		    String pw = request.getParameter("pw");
			
		    if (id.equals("admin") && pw.equals("1234")) {
		        session.setAttribute("userId",   id      );
		        session.setAttribute("userName", "관리자");
		        
		        view = "loginOK.jsp";
		    }else {
		    	view = "redirect:loginFail.jsp";
		    }
		
		}else if(com.equals("/logout")) {
			session.invalidate();
		    
		    view = "redirect:login_main.jsp";
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
