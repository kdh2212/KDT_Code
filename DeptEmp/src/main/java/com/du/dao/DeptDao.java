package com.du.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.du.dto.Dept;

public class DeptDao {
	private Connection getConnection() throws ClassNotFoundException, SQLException {  // DBMS 접속
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
		return conn;
	}

	public List<Dept> selectList(){
		List<Dept> list = new ArrayList<>();
		
		Dept dept = null;
		String sql = "select deptno,dname,loc from dept";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				dept = new Dept(deptno,dname,loc);
				list.add(dept);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
		
		
		return list;
		
	}
	
	public Dept selectOne(int deptno1) {
		// 포워딩 때문에 return 을 해주어야 한다.
		Dept dept = null;
		String sql = "select deptno,dname,loc from dept where deptno = " + deptno1;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // 받아올때 사용
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				dept = new Dept(deptno,dname,loc);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
		
				
				
				
		return dept;
	}
	
	public void insert(Dept dept) {
		String sql = String.format("insert into dept(deptno, dname, loc) values(%d,'%s','%s')",
						dept.getDeptno(),dept.getDname(),dept.getLoc());
		
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
	}
	
	
	public void update(Dept dept) {
		String sql = String.format("update dept set dname = '%s', loc='%s' where deptno = %d",
						                         dept.getDname(),dept.getLoc(),dept.getDeptno());
		
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
	}

	public void delete(String deptno) {
		String sql = "delete from dept where deptno = " + deptno;
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
