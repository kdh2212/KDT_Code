package quiz;

import java.time.LocalDateTime;

public class Product {
	private String product_id;
	private String product_name;
	private int quantity;
	private LocalDateTime created_at;
	
	public Product() {}
	
	
	public Product(String product_id, String product_name, int quantity, LocalDateTime created_at) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.quantity = quantity;
		this.created_at = created_at;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDateTime getCreated_at() {
		return created_at;
	}


	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}


	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", quantity=" + quantity
				+ ", created_at=" + created_at + "]";
	}
	
	
	
}
