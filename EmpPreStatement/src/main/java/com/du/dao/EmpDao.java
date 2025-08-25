package com.du.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.du.dto.Emp;




public class EmpDao {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {  // DBMS 접속
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
		return conn;
	}
	
	public List<Emp> selectList() {  // tiny 테이블의 모든 자료를 가져옴, 여러개
		List<Emp> emplist = new ArrayList<Emp>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    rs = stmt.executeQuery("SELECT empno,ename,job,mgr,to_char(hiredate, 'YYYY-MM-DD') as hiredate,sal,comm,deptno FROM emp order by empno" );
		    pstmt = conn.prepareStatement("SELECT empno,ename,job,mgr,to_char(hiredate, 'YYYY-MM-DD') as hiredate,sal,comm,deptno FROM emp order by empno");
		    rs = pstmt.executeQuery();
		    
		    while (rs.next()) {
		        int empno = rs.getInt("empno");
		        String ename = rs.getString("ename");
		        String job = rs.getString("job");
		        String mgr = rs.getString("mgr");
		        String hiredate = rs.getString("hiredate");
		        int sal = rs.getInt("sal");
		        int comm = rs.getInt("comm");
		        int deptno = rs.getInt("deptno");
		        
		        emplist.add(new Emp(empno, ename,job,mgr,hiredate,sal,comm,deptno));
		    }
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (rs != null) rs.close();
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
		return emplist;
	}
	
	public void insert(Emp emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
		    conn = getConnection();
		    pstmt = conn.prepareStatement("insert into emp(empno, ename,job,mgr,hiredate,sal,comm,deptno) values (?,?,?,?,?,?,?,?)");
//		    stmt = conn.createStatement();
//		    stmt.executeUpdate(String.format("insert into emp(empno, ename,job,mgr,hiredate,sal,comm,deptno) values (%d,'%s','%s','%s','%s',%d,%d,%d)",
//		    				emp.getEmpno(),emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno()));
		    pstmt.setInt(1, emp.getEmpno());
		    pstmt.setString(2, emp.getEname());
		    pstmt.setString(3, emp.getJob());
		    pstmt.setString(4, emp.getMgr());
		    pstmt.setString(5, emp.getHiredate());
		    pstmt.setInt(6, emp.getSal());
		    pstmt.setInt(7, emp.getComm());
		    pstmt.setInt(8, emp.getDeptno());
		    pstmt.executeUpdate();
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
		
	public void delete(int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    stmt.executeUpdate(String.format("delete from emp where empno = %d", empno));
		    pstmt = conn.prepareStatement("delete from emp where empno = ?");
		    pstmt.setInt(1, empno);
		    pstmt.executeUpdate();
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
	
		public Emp selectOne(int empno) { // 하나
			Emp emp = null;
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				 conn = getConnection();
//				 stmt = conn.createStatement();
//				 rs = stmt.executeQuery("SELECT empno,ename,job,mgr,to_char(hiredate, 'YYYY-MM-DD') as hiredate, sal, comm, deptno FROM emp where empno="+ empno);
				 pstmt = conn.prepareStatement("SELECT empno,ename,job,mgr,to_char(hiredate, 'YYYY-MM-DD') as hiredate, sal, comm, deptno FROM emp where empno = ?");
				 pstmt.setInt(1, empno);
				 rs = pstmt.executeQuery();
				  if (rs.next()) {
					  // 추가 부분
					  	empno = rs.getInt("empno");
				        String ename = rs.getString("ename");
				        String job = rs.getString("job");
				        String mgr = rs.getString("mgr");
				        String hiredate = rs.getString("hiredate");
				        int sal = rs.getInt("sal");
				        int comm = rs.getInt("comm");
				        int deptno = rs.getInt("deptno");
					  emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno);
 
				    }
				} catch (SQLException e) {
					System.out.println("데이터베이스 오류: " + e.getMessage());
				} catch (ClassNotFoundException e) {
					System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
				} finally {
				    try {
				        if (rs != null) rs.close();
				        if (pstmt != null) pstmt.close();
				        if (conn != null) conn.close();
				    } catch (SQLException e) {
				        System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
				    }
				}

			
			return emp;
		}
		
		public void update(Emp emp) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				 conn = getConnection();
//				 stmt = conn.createStatement();
//				 stmt.executeUpdate(String.format("update emp set ename = '%s' ,job = '%s', mgr = '%s', hiredate = '%s', sal = %d, comm = %d, deptno = %d  where empno = %d", 
//						 			empdto.getEname(),empdto.getJob(),empdto.getMgr(),empdto.getHiredate(),empdto.getSal(),empdto.getComm(),empdto.getDeptno(),empdto.getEmpno()));			 
				pstmt = conn.prepareStatement("update emp set ename = ? ,job = ?, mgr = ?, hiredate = ?, sal =?, comm = ?, deptno = ?  where empno = ?");
				pstmt.setString(1, emp.getEname());
				pstmt.setString(2, emp.getJob());
				pstmt.setString(3, emp.getMgr());
				pstmt.setString(4, emp.getHiredate());
				pstmt.setInt(5, emp.getSal());
				pstmt.setInt(6, emp.getComm());
				pstmt.setInt(7, emp.getDeptno());
				pstmt.setInt(8, emp.getEmpno());
				pstmt.executeUpdate();
				 
				} catch (SQLException e) {
					System.out.println("데이터베이스 오류: " + e.getMessage());
				} catch (ClassNotFoundException e) {
					System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
				} finally {
				    try {
				        
				        if (pstmt != null) pstmt.close();
				        if (conn != null) conn.close();
				    } catch (SQLException e) {
				        System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
				    }
				}
		}

}
