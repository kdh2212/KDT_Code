package com.du.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.du.dto.Dept;



/* PreparedStatement
 * 정리한 코드 
 */
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
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
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
				if(pstmt != null)pstmt.close();
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
		String sql = "select deptno,dname,loc from dept where deptno =  ? ";
		Connection conn = null;
		ResultSet rs = null; // 받아올때 사용
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
//			pstmt = conn.prepareStatement("select deptno,dname,loc from dept where deptno = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno1);
			rs = pstmt.executeQuery();
			
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
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
		
				
				
				
		return dept;
	}
	
	public void insert(Dept dept) {
		String sql = String.format("insert into dept(deptno, dname, loc) values(?,?,?)");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
//			pstmt = conn.prepareStatement("insert into dept(deptno, dname, loc) values(?,?,?)");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
	}
	
	
	public void update(Dept dept) {
		String sql = String.format("update dept set dname = ?, loc=? where deptno = ?");
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
//			pstmt = conn.prepareStatement("update dept set dname = ?, loc= ? where deptno = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
		}
	}

	public void delete(String deptno) {
		String sql = "delete from dept where deptno = ? ";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
//			pstmt = conn.prepareStatement("delete from dept where deptno = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deptno);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}finally {
			// 자원 반납 부분
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				System.out.println("리소스를 닫는 도중 오류 발생:" + e.getMessage());
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
