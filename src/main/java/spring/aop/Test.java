package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.config.AopConfig;

public class Test {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		UserDao userDao = context.getBean("userDao",UserDao.class);
		int add = userDao.add(2, 3);
		System.out.println(add);
	}
	

}
