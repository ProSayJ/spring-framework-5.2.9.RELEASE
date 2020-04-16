package com.prosayj.basecode.thinkinginspring.overview.dependency.lookup;

import com.prosayj.basecode.thinkinginspring.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖查找测试
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-16 上午 02:03
 * @since 1.0.0
 */
public class DependecyLookupDemo {
	public static void main(String[] args) {
		//配置xml文件
		//启动应用上下文
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("MATE-INF/dependecy-lookup-context.xml");


		//实时查找
		User user = beanFactory.getBean("user", User.class);
		System.out.println("user = " + user);



	}
}
