package com.prosayj.analysis.springsource.lifecycye;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * LifeCycleDomin
 *
 * @author yangjian
 * @date 2021-01-02 下午 09:28
 * @since 1.0.0
 */
public class LifeCycleDomin2 implements InitializingBean, BeanNameAware, BeanFactoryAware {

	private String userName;

	public LifeCycleDomin2() {
		System.out.println(">>>> UserService");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println(">>>> postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println(">>>> preDestroy");
	}

	public void customerInit() {
		System.out.println(">>>> customerInit");
	}

	public void customerDestory() {
		System.out.println(">>>> customerDestory");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(">>>> setBeanFactory");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(">>>> setBeanName");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">>>> afterPropertiesSet");
	}


	@Override
	public String toString() {
		return "LifeCycleDomin2{" +
				"userName='" + userName + '\'' +
				'}';
	}
}