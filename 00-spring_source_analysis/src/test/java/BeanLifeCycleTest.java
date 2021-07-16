import com.prosayj.analysis.springsource.lifecycye.LifeCycleDomin2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示 Spring Bean 的生命周期
 *
 * @author yangjian
 * @since 1.0.0
 */
public class BeanLifeCycleTest {
	@Test
	@DisplayName("Spring Bean 的生命周期：初始化、构建完成以后、销毁以后")
	public void testBeanLifeCycleTest2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04_BeanLifeCycleTest.xml");
		LifeCycleDomin2 bean = context.getBean(LifeCycleDomin2.class);
		bean.setUserName("张三");
		context.close();
	}
}
