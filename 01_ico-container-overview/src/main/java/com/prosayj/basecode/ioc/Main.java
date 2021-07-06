package com.prosayj.basecode.ioc;

import com.prosayj.basecode.ioc.beans.MyTestBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * IoC(Inverse of Control: 控制反转)
 * DI (Dependency Injection: 依赖注入)
 * <p>
 * 关于 Spring容器管理Bean的过程以及加载模式:
 * 1.需要将bean的定义信息声明在 Spring的配置文件当中。
 * 2.需要通过 Spring 抽象出的各种 Resource来指定对应的配置文件
 * 3.需要显式声明一个 Spring工厂,该工厂用来掌控我们在配置文件中所声明的各种bean以及bean之间的依赖关系与注入关系
 * 4.需要定义一个配置信息读取器,该读取器用来读取之前所定义的bean配置文件信息
 * 5.读取器的作用是读取我们所声明的配置文件信息,并且将读取后的信息装配到之前所声明的工厂当中
 * 6.需要将读取器与工厂以及资源对象进行相应的关联处理。
 * 7.工厂所管理的全部对象装配完毕,可以供客户端直接调用,获取客户端想要使用的各种bean对象。
 * <p>
 * Spring对于Bean管理的核心组件
 * 1.资源抽象
 * 2.工厂
 * 3.配置信息读取器
 * <p>
 * {@link org.springframework.beans.factory.BeanFactory} 是Spring Bean 工厂最顶层的抽象
 *
 * @author yangjian@bubi.cn
 * @date 2020-07-20 上午 08:52
 * @since 1.0.0
 */
public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring5/beanFactoryTest.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		beanDefinitionReader.loadBeanDefinitions(resource);
		MyTestBean bean = defaultListableBeanFactory.getBean(MyTestBean.class);
		System.out.println(bean);
	}
}
