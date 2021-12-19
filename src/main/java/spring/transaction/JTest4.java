package spring.transaction;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import spring.jdbcTemplate.service.UserService;
import spring.transaction.service.AccountService;

//@RunWith(SpringJUnit4ClassRunner.class) //单元测试框架
//@ContextConfiguration("classpath:bean1.xml") //加载配置文件
public class JTest4 {


    @Test
    public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		AccountService accountService = context.getBean("accountService",AccountService.class);
		accountService.accountMoney();
    }
}
