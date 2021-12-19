package spring.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.jdbcTemplate.entity.User;
import spring.jdbcTemplate.service.UserService;

public class Test {

	@org.junit.Test
	public void testAdd() {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		UserService userService = context.getBean("userService",UserService.class);
		User user = new User();
		user.setUserId("2");
		user.setUsername("frank2");
		user.setUstatus("2");
		userService.add(user);
	}
}
