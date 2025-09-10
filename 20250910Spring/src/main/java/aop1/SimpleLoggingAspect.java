package aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * @Aspect는 관점을 다르게 한다.
 * before은 aaa()가 실행되기 전에 실행이 된다.
 * aaa()의 실체는 execution(* aop1.SimpleService.doSomething(..)) 이거다 
 * SimpleService라는 클래스에 doSomethong()이라는 메소드
 */
@Aspect
public class SimpleLoggingAspect {
	
	@Pointcut("execution(* aop1.SimpleService.doSomething(..))")
	public void aaa() {}
	
	@Before("aaa()")
	public void before() {
		System.out.println("[AOP] 메서드 실행 전: Before advicce");
	}
	
	@After("aaa()")
	public void after() {
		System.out.println("[AOP] 메서드 실행: After advice");
	}
	
	@Around("execution(* aop1.SimpleService.doSomething(..))")
	public  Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		
		System.out.println("[AOP] 메서드 실행 전");
		
		Object result = joinPoint.proceed(); // 실제 메서드 실행 : doSomething 메서드가 실행되는거다.
		
		System.out.println("[AOP] 메서드 실행 후");
		
		long end = System.nanoTime();
		long duration = end - start;
		
		System.out.printf("[AOP] 실행 시간: %d ns \n", duration);
		return result;
	}
}
