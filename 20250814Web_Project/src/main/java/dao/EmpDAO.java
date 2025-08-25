package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.EmpDTO;




public class EmpDAO {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {  // DBMS 접속
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
		return conn;
	}
	
	public List<EmpDTO> selectList() {  // tiny 테이블의 모든 자료를 가져옴, 여러개
		List<EmpDTO> emplist = new ArrayList<EmpDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		    conn = getConnection();
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT empno,ename,job,mgr,to_char(hiredate, 'YYYY-MM-DD') as hiredate,sal,comm,deptno FROM emp order by empno" );
		    while (rs.next()) {
		        int empno = rs.getInt("empno");
		        String ename = rs.getString("ename");
		        String job = rs.getString("job");
		        String mgr = rs.getString("mgr");
		        String hiredate = rs.getString("hiredate");
		        int sal = rs.getInt("sal");
		        int comm = rs.getInt("comm");
		        int deptno = rs.getInt("deptno");
		        
		        emplist.add(new EmpDTO(empno, ename,job,mgr,hiredate,sal,comm,deptno));
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
		return emplist;
	}
	
	public void empinsertOne(EmpDTO empdto) {
		Connection conn = null;
		Statement stmt = null;

		try {
		    conn = getConnection();
		    stmt = conn.createStatement();
		    stmt.executeUpdate(String.format("insert into emp(empno, ename,job,mgr,hiredate,sal,comm,deptno) values (%d,'%s','%s','%s','%s',%d,%d,%d)",
		    				empdto.getEmpno(),empdto.getEname(),empdto.getJob(),empdto.getMgr(),empdto.getHiredate(),empdto.getSal(),empdto.getComm(),empdto.getDeptno()));
		  
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
		
	public void empdeleteOne(int empno) {
		Connection conn = null;
		Statement stmt = null;

		try {
		    conn = getConnection();
		    stmt = conn.createStatement();
		    stmt.executeUpdate(String.format("delete from emp where empno = %d", empno));
		  
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
	
		public EmpDTO empselectOne(int empno) { // 하나
			EmpDTO empdto = null;
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				 conn = getConnection();
				 stmt = conn.createStatement();
				 rs = stmt.executeQuery("SELECT empno,ename,job,mgr,to_char(hiredate, 'YYYY-MM-DD') as hiredate, sal, comm, deptno FROM emp where empno="+ empno);
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
					  empdto = new EmpDTO(empno,ename,job,mgr,hiredate,sal,comm,deptno);
 
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

			
			return empdto;
		}
		
		public void empupdateOne(EmpDTO empdto) {
			Connection conn = null;
			Statement stmt = null;
			
			try {
				 conn = getConnection();
				 stmt = conn.createStatement();
				 stmt.executeUpdate(String.format("update emp set ename = '%s' ,job = '%s', mgr = '%s', hiredate = '%s', sal = %d, comm = %d, deptno = %d  where empno = %d", 
						 			empdto.getEname(),empdto.getJob(),empdto.getMgr(),empdto.getHiredate(),empdto.getSal(),empdto.getComm(),empdto.getDeptno(),empdto.getEmpno()));			 
					
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
