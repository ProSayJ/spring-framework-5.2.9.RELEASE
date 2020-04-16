package com.prosayj.basecode.thinkinginspring.overview.dependency.lookup;

import com.prosayj.basecode.thinkinginspring.overview.annotation.Super;
import com.prosayj.basecode.thinkinginspring.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 依赖查找测试
 * 1:通过名称查找
 * 2:通过类型查找
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-16 上午 02:03
 * @since 1.0.0
 */
public class DependecyLookupDemo {
	public static void main(String[] args) {
		//配置xml文件
		//启动spring应用上下文
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:MATE-INF/dependecy-lookup-context.xml");

		lookupInRealTime(beanFactory);
		lookupInLazy(beanFactory);

		lookupByType(beanFactory);
		lookupByCollectionType(beanFactory);

		lookupByAnnotationType(beanFactory);


	}

	/**
	 * 通过注解查找
	 *
	 * @param beanFactory bean工厂
	 */
	@SuppressWarnings("unchecked")
	private static void lookupByAnnotationType(BeanFactory beanFactory) {
		if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			//Map<String, User> users = (Map<String, User>) listableBeanFactory.getBeansWithAnnotation(Super.class);
			//欺骗编译器的方法
			Map<String, User> users = (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
			System.out.println("通过注解查找 查找标注 @Super 注解的所有 User 集合对象====>" + users);
		}
	}

	/**
	 * 按照类型查找-集合对象
	 *
	 * @param beanFactory bean工厂
	 */
	private static void lookupByCollectionType(BeanFactory beanFactory) {
		if (beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
			System.out.println("按照类型查找-集合对象 查找到所有的 User 集合对象====>" + users);
		}
	}

	/**
	 * 按照类型查找-单一类型
	 *
	 * @param beanFactory bean工厂
	 */
	private static void lookupByType(BeanFactory beanFactory) {
		User bean = beanFactory.getBean(User.class);
		System.out.println("按照类型查找-单一类型====>" + bean);
	}


	/**
	 * 通过名称查找-实时查找
	 *
	 * @param beanFactory bean工厂
	 */
	public static void lookupInRealTime(BeanFactory beanFactory) {
		User user = beanFactory.getBean("user", User.class);

		System.out.println("通过名称查找-实时查找====>" + user);
	}

	/**
	 * 通过名称查找-延时查找
	 *
	 * @param beanFactory bean工厂
	 */
	@SuppressWarnings("unchecked")
	public static void lookupInLazy(BeanFactory beanFactory) {
		ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
		User user = objectFactory.getObject();
		System.out.println("通过名称查找-延时查找====>" + user);


	}
}
