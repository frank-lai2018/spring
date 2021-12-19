package spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"spring.aop"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AopConfig {

}
