package chap08;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	private JdbcTemplate jdbcTemplate;
	
	public MemberDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Member selectByEmail2(String email) {
		return jdbcTemplate.queryForObject("select * from member where email=?", 
				
				new BeanPropertyRowMapper<>(Member.class)
				,email);
	}
	
	public Member selectByEmail(String email) {
		List<Member> results = jdbcTemplate.query("select * from member where email=?", 
				
				
				(rs,num) -> {
					Member mem = new Member(
							rs.getLong("id"),
							rs.getString("email"),
							rs.getString("password"),
							rs.getString("name"),null);
	
	
					return mem;
				},
//				new RowMapper<Member>() {
//
//					@Override
//					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
//						Member mem = new Member(rs.getString("email"),
//												rs.getString("password"),
//												rs.getString("name"),null);
//						
//						
//						return mem;
//					}
//			
//		}, 
		email);
		return results.get(0);
	}
	
	public void inset(Member member) {
		jdbcTemplate.update(
			"INSERT INTO member (email,name,password) VALUES (?,?,?)",
			member.getEmail(),member.getName(),member.getPassword()
			);
		}
}
