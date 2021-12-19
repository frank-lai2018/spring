package spring.aop;

import org.springframework.stereotype.Service;

@Service
public class UserDao {

	public int add(int a,int b) {
		System.err.println("UserDao add....");
		return a+b;
	}
}
