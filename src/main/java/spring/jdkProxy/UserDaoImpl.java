package spring.jdkProxy;

public class UserDaoImpl implements UserDao {

	public int add(int a, int b) {
		System.out.println("UserDaoImpl add....");
		return a+b;
	}

	public void update() {
		System.out.println("UserDaoImpl update....");

	}

}
