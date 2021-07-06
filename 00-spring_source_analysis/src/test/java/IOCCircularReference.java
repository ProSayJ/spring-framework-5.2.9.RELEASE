import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ioc 容器源码分析基础案例
 *
 * @author yangjian
 * @date 2021-05-18
 */
public class IOCCircularReference {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classpath:applicationContext-circular-reference.xml");
	}
}
