package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	@Bean
	public Greeter greeter() { // 클래스 이름으로 메소드를 만든다. greeter 클래스 이름
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
	@Bean
	public Greeter greeter2() { // 클래스 이름으로 메소드를 만든다. greeter 클래스 이름
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
}
