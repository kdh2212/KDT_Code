package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gugudanServlet
 */
@WebServlet("/gugudan")
public class gugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gugudanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); //JSP의 response 기본 객체
		PrintWriter out = response.getWriter(); // JSP의 out 기본 객체
		int result = 0;
		int num1 = Integer.parseInt(request.getParameter("num"));
		out.println("<h1>"+num1+"단"+"</h1>");
		for(int i= 1; i< 10; i++){
			result = num1 * i;
			out.println("<h1>" + num1 +"*"+ i + "="+(result) + "</h1>");
			out.println(num1 +"*"+ i + "="+(result) + "<br/>");
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
