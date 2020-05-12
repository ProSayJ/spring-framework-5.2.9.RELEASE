package com.prosayj.basecode.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassPathXmlApplicationContext 通过XML配置
 *
 * @author yangjian@bubi.cn
 * @date 2020-05-12 上午 10:46
 * @since 1.0.0
 */
public class Ioc2ClassPathXmlApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring5/beanFactoryTest.xml");
		System.out.println(context.getBean("myTestBean"));
	}


}
