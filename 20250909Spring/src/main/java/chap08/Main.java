package chap08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static AnnotationConfigApplicationContext ctx = null; 
		
	
	
	
	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		MemberDao dao = ctx.getBean(MemberDao.class);
		
//		Member mem = new Member("aaa@korea.com","1234","홍길동",null);
//		dao.inset(mem);
//		System.out.println("입력 성공!");
		
//		Member member = dao.selectByEmail("aaa@korea.com");
//		System.out.println(member);
		
		Member member = dao.selectByEmail2("aaa@korea.com");
		System.out.println(member);
	}

}
