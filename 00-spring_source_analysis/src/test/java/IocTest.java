import com.prosayj.analysis.springsource.ioc.MyBeanStage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ioc 容器源码分析基础案例
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class IocTest {
	public static void main(String[] args) {
		// ApplicationContext是容器的高级接口，BeanFacotry（顶级容器/根容器，规范了/定义了容器的基础行为）
		// Spring应用上下文，官方称之为 IoC容器（错误的认识：容器就是map而已；准确来说，map是ioc容器的一个成员，
		// 叫做单例池, singletonObjects,容器是一组组件和过程的集合，包括BeanFactory、单例池、BeanPostProcessor等以及之间的协作流程）

		/*
		 * Ioc容器创建管理Bean对象的，Spring Bean是有生命周期的
		 * 构造器执行、初始化方法执行、Bean后置处理器的before/after方法、：AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * Bean工厂后置处理器初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * Bean后置处理器初始化：AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-Ioc.xml");
		MyBeanStage bean = context.getBean(MyBeanStage.class);
		System.out.println(bean);
	}
}
