package com.prosayj.analysis.springsource.ioc;

import com.prosayj.analysis.springsource.bean.BaseBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 测试 Bean 生命周期：初始化的回调,初始化完成以后的回调
 * <p>
 * 构造器	refresh#finshBeanFactoryInitialization(beanFactory)(beanFactory)
 * BeanFactoryPostProcessor 	初始化	refresh#invokeBeanFactoryPostProcessors(beanFactory)
 * BeanFactoryPostProcessor 	⽅法调⽤	refresh#invokeBeanFactoryPostProcessors(beanFactory)
 * BeanPostProcessor 			初始化	registerBeanPostProcessors(beanFactory)
 * BeanPostProcessor 			⽅法调⽤	refresh#ﬁnishBeanFactoryInitialization(beanFactory)
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class MyBeanStage extends BaseBean implements
		InitializingBean,
		BeanPostProcessor,
		BeanFactoryPostProcessor {

	/**
	 * 构造函数
	 */
	public MyBeanStage() {
		System.out.println("==============>MyBeanStage 构造器执行...");
	}


	/**
	 * 强制实现
	 * {@link InitializingBean#afterPropertiesSet()}
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("==============> InitializingBean#afterPropertiesSet() 实现被调用中......");
	}

	/**
	 * 强制实现
	 * {@link BeanFactoryPostProcessor#postProcessBeanFactory(ConfigurableListableBeanFactory)}
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor#postProcessBeanFactory 实现被调用中......");
	}

	/**
	 * 非强制实现
	 * {@link BeanPostProcessor#postProcessBeforeInitialization(Object, String)}
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("myBeanStage".equals(beanName)) {
			System.out.println("==============> BeanPostProcessor#postProcessBeforeInitialization 实现被调用中......");
		}
		return bean;
	}

	/**
	 * 非强制实现
	 * <p>
	 * {@link BeanPostProcessor#postProcessAfterInitialization(Object, String)}
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("myBeanStageTest".equals(beanName)) {
			System.out.println("==============> BeanPostProcessor#postProcessAfterInitialization 实现被调用中......");
		}
		return bean;
	}


	public void print() {
		System.out.println("MyInitialzingBean print方法业务逻辑执行");
	}

	@Override
	public String toString() {
		return "MyBeanStageTest{} " + super.toString();
	}
}
