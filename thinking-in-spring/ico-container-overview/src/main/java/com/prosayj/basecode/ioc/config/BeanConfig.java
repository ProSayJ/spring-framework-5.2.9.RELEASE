package com.prosayj.basecode.ioc.config;

import com.prosayj.basecode.ioc.beans.MyTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
	public MyTestBean registMyTestBean() {
		return new MyTestBean();
	}
}
