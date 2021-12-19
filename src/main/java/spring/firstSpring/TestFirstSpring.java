package spring.firstSpring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFirstSpring {

	@Test
	public void testrAdd() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = context.getBean("user", User.class);
		user.add();
	}
}
