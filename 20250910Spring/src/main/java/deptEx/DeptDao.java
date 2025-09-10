package deptEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;



@Component
public class DeptDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public DeptDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Member> selectAll(){
		return jdbcTemplate.query("select * from dept ", 
				// 람다식 표현
				(rs, rowNum)->{
					Member mem = new Member(
							rs.getInt("deptno"),
							rs.getString("dname"),
							rs.getString("loc")
							);
							
					return mem;
				});
	}
	
	public Member selectByDeptno(int deptno) {
		return jdbcTemplate.queryForObject("select * from dept where deptno = ?",
				new BeanPropertyRowMapper<>(Member.class)
					,deptno);
				
	}
	
	public void update(Member member) {
		jdbcTemplate.update(
				"update  dept set dname = ? , loc = ? where deptno = ?",
				member.getDname(),member.getLoc(),member.getDeptno());
		
		
	}
	
	public void delete(int deptno) {
		
		 jdbcTemplate.update("delete from dept where deptno = ?", 
				deptno);
	}
	
	
	public void insert(Member member) {
		 jdbcTemplate.update(
				"insert into dept (deptno,dname,loc) VALUES(?,?,?)",
				member.getDeptno(),member.getDname(),member.getLoc());
		
	}
	
	
	
}
