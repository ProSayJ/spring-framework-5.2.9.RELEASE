package com.prosayj.basecode.ioc.config;

import com.prosayj.basecode.ioc.beans.MyTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * 配置类
 *
 * @author yangjian@bubi.cn
 * @date 2020-05-10 上午 12:40
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.prosayj.basecode.ioc")
public class BeanConfig {

	@Bean(name = "myTestBean")
	@Description("myTestBean 类描述")
	public MyTestBean registMyTestBean() {
		MyTestBean myTestBean = new MyTestBean();
		myTestBean.setTestStr("3333333333333");
		return myTestBean;
	}
}
