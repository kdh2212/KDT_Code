package chap05_2;
/*
 * 컴포넌트 스캔 예제 코드
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "chap05_2")
public class AppCtx {
	
	
}
