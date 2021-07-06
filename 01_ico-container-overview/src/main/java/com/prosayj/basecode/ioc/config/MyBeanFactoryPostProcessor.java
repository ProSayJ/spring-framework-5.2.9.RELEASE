package com.prosayj.basecode.ioc.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * MyBeanFactoryPostProcessor
 * 可以手动设置 BeanDefinition 中的 beanClass.
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-14 下午 02:50
 * @since 1.0.0
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition indexService = (GenericBeanDefinition) beanFactory.getBeanDefinition("indexService");
        System.out.println("indexService.getBeanClass()---before = " + indexService.getBeanClass());
//        indexService.setBeanClass(UserService.class);
        System.out.println("indexService.getBeanClass()---end = " + indexService.getBeanClass());
    }
}
