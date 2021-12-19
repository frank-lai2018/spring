package spring;

import spring.jdkProxy.UserDao;

public class UserFactory {

	public static UserDao getDao() throws Exception {
		
		String classValue = "spring.UserDao";
		Class clazz= Class.forName(classValue);
		return (UserDao) clazz.newInstance();
		
	}
}
