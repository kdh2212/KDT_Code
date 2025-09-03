package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
					= new AnnotationConfigApplicationContext(AppCtx.class);
		
		MemberRegisterService memSvc 
			= ctx.getBean("memberRegisterService",MemberRegisterService.class);
		memSvc.memberRegister();

	}

}
