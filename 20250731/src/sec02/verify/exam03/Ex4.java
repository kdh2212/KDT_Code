package sec02.verify.exam03;


class Controller{
	public MemberService service; // has-a

	public void setService(MemberService service) {
		this.service = service;
	}
	public void method1(MemberService memberService) {
		this.setService(memberService);
		this.service.login();
	}
	
	
	
	
}
class Service{
	public void login() {
		System.out.println("로그인");
	}
}
class MemberService extends Service{

	@Override
	public void login() {
		System.out.println("멤버 로그인");
	}
	
}
class AService extends MemberService{

	@Override
	public void login() {
		System.out.println("A 로그인");
	}
	
}
class BService extends MemberService{}
class BoardService extends Service{}
class DService extends BoardService{}
public class Ex4 {

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setService(new MemberService());
		controller.service.login();
		
//		controller.method1(new AService());
		controller.setService(new AService());
		controller.service.login();

	}

}
