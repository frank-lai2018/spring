package spring.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JdkProxy implements InvocationHandler {

	private Object obj;
	
	public JdkProxy(Object obj) {
		this.obj = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法調用前....mehtod name = "+method.getName()+" args="+Arrays.toString(args));
		
		Object res= method.invoke(obj, args);
		
		System.out.println("方法調用後....res="+res);
		return res;
	}

}
