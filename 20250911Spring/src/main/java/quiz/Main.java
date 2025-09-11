package quiz;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx 
			= new AnnotationConfigApplicationContext(AppCtx.class);
		
		ProductDao dao = ctx.getBean(ProductDao.class);
		Product product = new Product("KD13","TV",3,LocalDateTime.now());
		
		
		//dao.insert(product);
		//System.out.println(dao.selectById("KD11"));
		Product product3 = new Product("KD14","키보드",10,LocalDateTime.now());
		//dao.insert(product3);
		//dao.update(product3);
		//dao.delete("KD14");
		
		for (Product product2 : dao.selectAll()) {
			System.out.println(product2);
		}
	}

}
