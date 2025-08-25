package sec03.check03;

abstract class HttpServlet {
	public abstract void service(); // 추상 메소드 정의
	
}

class LoginServlet extends HttpServlet{
	public void service() {
		System.out.println("로그인 합니다.");
	}
	
}
	
class FileDownloadServlet extends HttpServlet{
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
		
		}

}

