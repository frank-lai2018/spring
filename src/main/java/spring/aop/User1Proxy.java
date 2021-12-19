package spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)//數字值越小，優先序越高
public class User1Proxy {

	@Pointcut(value="execution(* spring.aop.UserDao.add(..))")
	public void pointcut() {
		
	}
	
	@Before(value = "pointcut()")
	public void before() {
		System.out.println("111before..........");
	}
}
