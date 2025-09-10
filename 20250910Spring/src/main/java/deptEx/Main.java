package deptEx;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
			= new AnnotationConfigApplicationContext(AppCtx.class);
	
		DeptDao dao = ctx.getBean(DeptDao.class);
		Member member = new Member(50,"DEV","JAPEN");
		
//		dao.insert(member);
//		System.out.println("입력");
		
//		System.out.println(dao.selectByDeptno(50));
//		Member member3 = new Member(50,"DEV","KOREA");
//		dao.update(member3);
//		System.out.println("업데이트");
		
		
		dao.delete(50);
		System.out.println("삭제");
		System.out.println("검색-------------------------------------------------------------");
		for(Member member2 : dao.selectAll()) {
			System.out.println(member2);
		}
		
		


	}

}
