package spring;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class UserDao implements BeanPostProcessor {
//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("在初始化之前執行的方法");
//		return bean;
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("在初始化之後執行的方法");
//		return bean;
//	}
}