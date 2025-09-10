package chap08;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
			= new AnnotationConfigApplicationContext(AppCtx.class);
		MemberDao dao = ctx.getBean(MemberDao.class);
		Member member = new Member(null, "kbr@korea.com", "1234", "김바람", LocalDateTime.now());
		
//		dao.insert2(member);
//		System.out.println("입력!" + member.getId()); // id 값을 가지고 옴
		
//		System.out.println("검색: "+  dao.selectByEmail2("kbr@korea.com"));
//		System.out.println(dao.count("kbr@korea.com") + "건");
		
		
//		System.out.print("검색: "+  dao.selectAll());
		
		for (Member member2 : dao.selectAll()) {
			System.out.println(member2);
		}
		


	}

}
