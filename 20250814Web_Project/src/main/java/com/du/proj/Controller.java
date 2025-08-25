package com.du.proj;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DeptDAO;
import dao.EmpDAO;
import dao.JoinDAO;

import dto.DeptDTO;
import dto.EmpDTO;
import dto.JoinDTO;



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
		
		if(com.equals("/joinlist") || com.equals("/")) {
			JoinDAO joindao = new JoinDAO();
			List<JoinDTO> joinlist = joindao.selectList();
			request.setAttribute("joinlist", joinlist);
			view = "joinlist.jsp";
			
		}else if(com.equals("/list")) {
			DeptDAO deptdao = new DeptDAO();
			List<DeptDTO> deptlist = deptdao.selectList();
			request.setAttribute("deptlist", deptlist);
			view = "list.jsp";
			
		}else if(com.equals("/emplist")) {
			EmpDAO empdao = new EmpDAO();
			List<EmpDTO> emplist = empdao.selectList();
//			System.out.println(emplist);
			request.setAttribute("emplist", emplist);
			view = "emplist.jsp";
		}else if(com.equals("/empinsertForm")) {
			view = "redirect:empinsertForm.jsp";
		}else if(com.equals("/empinsert")) {
			//System.out.println(1);
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String mgr = request.getParameter("mgr");
			String hiredate = request.getParameter("hiredate");
			int sal = Integer.parseInt(request.getParameter("sal"));
			int comm = Integer.parseInt(request.getParameter("comm"));
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			EmpDTO dto = new EmpDTO(empno,ename, job,mgr,hiredate,sal,comm,deptno);
			//System.out.println(dto);
			EmpDAO dao = new EmpDAO();
			dao.empinsertOne(dto);
			view = "redirect:emplist";
		}else if(com.equals("/empdelete")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDAO dao = new EmpDAO();
			dao.empdeleteOne(empno);
			view = "redirect:emplist";
		}else if(com.equals("/empupdateForm")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDAO empdao = new EmpDAO();
			EmpDTO empdto = empdao.empselectOne(empno);
			request.setAttribute("empdto", empdto);
			view = "empupdateForm.jsp";
		}else if(com.equals("/empupdate")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String mgr = request.getParameter("mgr");
			String hiredate = request.getParameter("hiredate");
			int sal = Integer.parseInt(request.getParameter("sal"));
			int comm = Integer.parseInt(request.getParameter("comm"));
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			EmpDAO dao = new EmpDAO();
			dao.empupdateOne(new EmpDTO(empno,ename,job,mgr,hiredate,sal,comm,deptno));
			view = "redirect:emplist";
		}else if(com.equals("/deptinsertForm")) {
			view = "redirect:deptinsertForm.jsp";
		}else if(com.equals("/deptinsert")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			
			DeptDTO deptdto = new DeptDTO(deptno,dname,loc);
			DeptDAO deptdao = new DeptDAO();
			deptdao.deptinsertOne(deptdto);
			view = "redirect:list";
		}else if(com.equals("/deptdelete")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			DeptDAO dao = new DeptDAO();
			dao.deptdeleteOne(deptno);
			view = "redirect:list";
		}else if(com.equals("/deptupdateForm")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			DeptDAO deptdao = new DeptDAO();
			DeptDTO deptdto = deptdao.deptselectOne(deptno);
			request.setAttribute("deptdto", deptdto);
			view = "deptupdateForm.jsp";
		}else if(com.equals("/deptupdate")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			
			DeptDAO deptdao = new DeptDAO();
			deptdao.deptupdateOne(new DeptDTO(deptno,dname,loc));
			view = "redirect:list";
		}
			
		
		if(view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		}else {
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
