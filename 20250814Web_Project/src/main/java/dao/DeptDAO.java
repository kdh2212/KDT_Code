package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.DeptDTO;
import dto.EmpDTO;


public class DeptDAO {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {  // DBMS 접속
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
		return conn;
	}
	
	public List<DeptDTO> selectList() {  // tiny 테이블의 모든 자료를 가져옴, 여러개
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		    conn = getConnection();
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT * FROM dept order by deptno" );
		    while (rs.next()) {
		        int deptno = rs.getInt("deptno");
		        String dname = rs.getString("dname");
		        String loc = rs.getString("loc");
		        list.add(new DeptDTO(deptno, dname,loc));
		    }
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (rs != null) rs.close();
		        if (stmt != null) stmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
		return list;
	}
	public void deptinsertOne(DeptDTO deptdto) {
		Connection conn = null;
		Statement stmt = null;

		try {
		    conn = getConnection();
		    stmt = conn.createStatement();
		    stmt.executeUpdate(String.format("insert into dept(deptno,dname,loc) values (%d,'%s','%s')",deptdto.getDeptno(),deptdto.getDname(),deptdto.getLoc()));
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (stmt != null) stmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
	public void deptdeleteOne(int deptno) {
		Connection conn = null;
		Statement stmt = null;

		try {
		    conn = getConnection();
		    stmt = conn.createStatement();
		    stmt.executeUpdate(String.format("delete from dept where deptno = %d", deptno));
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (stmt != null) stmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
	
	public DeptDTO deptselectOne(int deptno) { // 하나
		DeptDTO deptdto = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			 conn = getConnection();
			 stmt = conn.createStatement();
			 rs = stmt.executeQuery("SELECT deptno,dname,loc FROM dept where deptno="+ deptno);
			  if (rs.next()) {
				  // 추가 부분
				  	deptno = rs.getInt("deptno");
			        String dname = rs.getString("dname");
			        String loc = rs.getString("loc");
			        deptdto = new DeptDTO(deptno,dname,loc);
				  
				  
				  
			    }
			} catch (SQLException e) {
				System.out.println("데이터베이스 오류: " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
			} finally {
			    try {
			        if (rs != null) rs.close();
			        if (stmt != null) stmt.close();
			        if (conn != null) conn.close();
			    } catch (SQLException e) {
			        System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
			    }
			}

		
		return deptdto;
	}
	
	public void deptupdateOne(DeptDTO deptdto) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			 conn = getConnection();
			 stmt = conn.createStatement();
			 stmt.executeUpdate(String.format("update dept set dname = '%s' , loc = '%s'  where deptno = %d", 
					 			deptdto.getDname(),deptdto.getLoc(),deptdto.getDeptno()));			 
				
			} catch (SQLException e) {
				System.out.println("데이터베이스 오류: " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
			} finally {
			    try {
			        
			        if (stmt != null) stmt.close();
			        if (conn != null) conn.close();
			    } catch (SQLException e) {
			        System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
			    }
			}
	}
	
	

}
