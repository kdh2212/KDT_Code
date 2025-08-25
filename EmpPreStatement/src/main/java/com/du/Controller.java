package com.du;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.du.dao.EmpDao;

import com.du.dto.Emp;


/*
 * emp 테이블 PreparedStatement 로 만들기
 */
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
		
		if(com.equals("/") || com.equals("/emp")) {
//			DeptDao dao = new DeptDao();
			EmpDao dao = new EmpDao();
			List<Emp> list = dao.selectList();
			request.setAttribute("list", list); // (key, value) 이다.
			request.setAttribute("isUpdate", "no");//update / insert  구분
			view = "emp.jsp";
		}else if(com.equals("/delete")) {
			String empno = request.getParameter("empno");
			EmpDao dao = new EmpDao();
			dao.delete(Integer.parseInt(empno));
			view = "redirect:emp";
		}else if(com.equals("/insert")) {
			request.setCharacterEncoding("utf-8");
			String isUpdate = request.getParameter("isUpdate"); // update
			
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String mgr = request.getParameter("mgr");
			String hiredate = request.getParameter("hiredate");
			int sal = Integer.parseInt(request.getParameter("sal"));
			int comm = Integer.parseInt(request.getParameter("comm"));
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			
			Emp emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno);
			EmpDao dao = new EmpDao();
			
			if(isUpdate.equals("no")) {
				dao.insert(emp);
				
			}else if(isUpdate.equals("yes")){
				// update 실행
				dao.update(emp);
			}
			
			view = "redirect:emp";
		}else if(com.equals("/updateForm")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDao dao = new EmpDao();
			Emp emp = dao.selectOne(empno);
			request.setAttribute("dto", emp);
			// List 부분 두줄을 넣으면 목록이 나온다.
			List<Emp> list = dao.selectList();
			request.setAttribute("list", list); // (key, value) 이다.
			request.setAttribute("isUpdate", "yes");//update / insert  구분
			view = "emp.jsp"; // redirect 에 안걸리고 forward로 간다.
			
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
