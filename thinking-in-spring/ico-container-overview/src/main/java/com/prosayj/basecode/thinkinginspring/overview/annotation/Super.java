package com.prosayj.basecode.thinkinginspring.overview.annotation;


import java.lang.annotation.*;

/**
 * Super注解
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-16 下午 03:21
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
//保留策略：运行时可以被反射读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface Super {
}
