package quiz;

import java.time.LocalDateTime;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;





@Component
public class ProductDao {
	private JdbcTemplate jdbcTemplate;
	
	public ProductDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Product> selectAll(){
		return jdbcTemplate.query("select * from product ", 
				// 람다식 표현
				(rs, rowNum)->{
					Product product = new Product(
							rs.getString("product_id"),
							rs.getString("product_name"),
							rs.getInt("quantity"),
							rs.getTimestamp("created_at").toLocalDateTime()
							);
							
					return product;
				});
	}
	
	
	public Product selectById(String product_id) {
		return jdbcTemplate.queryForObject("select * from product where product_id = ?",
				new BeanPropertyRowMapper<>(Product.class)
					,product_id);
				
	}
	
	public void update(Product product) {
		jdbcTemplate.update(
				"update  product set product_name = ? , quantity = ?, created_at = ? where product_id = ?",
				product.getProduct_name(),product.getQuantity(),LocalDateTime.now(),product.getProduct_id());
		
		
	}
	
	public void delete(String product_id) {
		
		 jdbcTemplate.update("delete from product where product_id = ?", 
				 product_id);
	}
	
	
	public void insert(Product product) {
		 jdbcTemplate.update(
				"insert into product (product_id,product_name,quantity,created_at) VALUES(?,?,?,?)",
				product.getProduct_id(),product.getProduct_name(),product.getQuantity(),LocalDateTime.now());
		
	}
	
	
	
}
