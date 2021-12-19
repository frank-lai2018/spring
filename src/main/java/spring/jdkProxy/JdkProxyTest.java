package spring.jdkProxy;

import java.lang.reflect.Proxy;

public class JdkProxyTest {
	
	public static void main(String[] args) {
		Class[] interfaces = {UserDao.class};
		UserDao userDao = (UserDao) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), interfaces, new JdkProxy(new UserDaoImpl()));
		userDao.add(2, 3);
	}

}
