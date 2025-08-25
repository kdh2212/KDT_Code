package com.du;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.du.dao.DeptDao;
import com.du.dto.Dept;

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
		String conPath =request.getContextPath();
//		System.out.println(url);
//		System.out.println(conPath);
		String com = uri.substring(conPath.length());
		
		if(com.equals("/") || com.equals("/dept")) {
			DeptDao dao = new DeptDao();
			List<Dept> list = dao.selectList();
			request.setAttribute("list", list); // (key, value) 이다.
			request.setAttribute("isUpdate", "no");//update / insert  구분
			view = "dept.jsp";
		}else if(com.equals("/delete")) {
			String deptno = request.getParameter("deptno");
			DeptDao dao = new DeptDao();
			dao.delete(deptno);
			view = "redirect:dept";
		}else if(com.equals("/insert")) {
			request.setCharacterEncoding("utf-8");
			String isUpdate = request.getParameter("isUpdate"); // update
			
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			
			Dept dept = new Dept(deptno,dname,loc);
			DeptDao dao = new DeptDao();
			
			if(isUpdate.equals("no")) {
				dao.insert(dept);
				
			}else if(isUpdate.equals("yes")){
				// update 실행
				dao.update(dept);
			}
			
			view = "redirect:dept";
		}else if(com.equals("/updateForm")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			DeptDao dao = new DeptDao();
			Dept dept = dao.selectOne(deptno);
			request.setAttribute("dto", dept);
			// List 부분 두줄을 넣으면 목록이 나온다.
			List<Dept> list = dao.selectList();
			request.setAttribute("list", list); // (key, value) 이다.
			request.setAttribute("isUpdate", "yes");//update / insert  구분
			view = "dept.jsp"; // redirect 에 안걸리고 forward로 간다.
			
		}
		
		
		
		
		if(view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		}else {
			// 포워딩
			// 포워딩을 view를 즉 a.jsp를 한다.
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
