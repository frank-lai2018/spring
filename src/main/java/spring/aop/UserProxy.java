package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)//數字值越小，優先序越高
public class UserProxy {

	@Before(value = "execution(* spring.aop.UserDao.add(..))")
	public void before() {
		System.out.println("before..........");
	}
	
	@After(value = "execution(* spring.aop.UserDao.add(..))")
	public void after() {
		System.out.println("after..........");
	}
	
	@AfterReturning(value = "execution(* spring.aop.UserDao.add(..))")
	public void afterReturning() {
		System.out.println("@AfterReturning..........");
	}
	
	@AfterThrowing(value = "execution(* spring.aop.UserDao.add(..))")
	public void afterThrowing() {
		System.out.println("AfterThrowing..........");
	}
	
	@Around(value = "execution(* spring.aop.UserDao.add(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("before Around..........");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("after Around..........");
		return obj;
	}
}
