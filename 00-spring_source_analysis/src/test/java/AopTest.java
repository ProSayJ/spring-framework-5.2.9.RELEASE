import com.prosayj.analysis.springsource.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AOP 容器源码分析基础案例
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class AopTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		MyBean myBean = applicationContext.getBean(MyBean.class);
		myBean.print();
	}

}
