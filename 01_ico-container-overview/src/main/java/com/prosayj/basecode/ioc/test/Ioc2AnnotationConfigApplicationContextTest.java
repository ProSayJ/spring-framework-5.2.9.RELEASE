package com.prosayj.basecode.ioc.test;

import com.prosayj.basecode.ioc.beans.MyTestBean;
import com.prosayj.basecode.ioc.config.BeanConfig;
import com.prosayj.basecode.ioc.service.UserService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AnnotationConfigApplicationContext 通过java config 类配置
 *
 * @author yangjian@bubi.cn
 * @date 2020-05-12 上午 10:49
 * @since 1.0.0
 */
public class Ioc2AnnotationConfigApplicationContextTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Spring container started and is ready");
		System.out.println(context.getBean(MyTestBean.class));

		/**
		 * sacn
		 * parser
		 *GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		 *         genericBeanDefinition.setParentName("");
		 * validate
		 */

//		BeanDefinition beanDefinition = context.getBeanDefinition("myTestBean");
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		UserService bean = context.getBean(UserService.class);
	}

}
