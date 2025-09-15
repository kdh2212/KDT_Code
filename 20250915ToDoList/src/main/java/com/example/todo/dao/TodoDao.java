package com.example.todo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.todo.model.Todo;

@Repository
public class TodoDao {
	
	
	private final JdbcTemplate jdbcTemplate;
	
	public TodoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	private static class TodoRowMapper implements RowMapper<Todo>{ // RowMapper 를 사용하면 내부적으로 반복을 진행한다.그리고 ArrayList에 넣어준다.
		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException{
			Todo todo = new Todo();
			todo.setId(rs.getInt("id"));
			todo.setTitle(rs.getString("title"));
			todo.setCompleted(rs.getBoolean("completed"));
			return todo;
		}
	}
	
	public List<Todo> findAll(){
		String sql = "SELECT * FROM todos";
		return jdbcTemplate.query(sql,new TodoRowMapper()); // 위의 클래스가 객체생성 되는거다.
	}
	
	public void add(String title) {
		String sql = "INSERT INTO todos (title) VALUES(?)";
		jdbcTemplate.update(sql,title);
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM todos WHERE id = ?";
		jdbcTemplate.update(sql,id);
	}
	
	public void toggleCompleted(int id) {
		String sql = "UPDATE todos SET completed = NOT completed WHERE id = ?";
		jdbcTemplate.update(sql,id);
	}
}
