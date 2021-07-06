package com.prosayj.basecode.ioc.service;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

/**
 * UserService
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-14 下午 02:19
 * @since 1.0.0
 */
@Component
@Description("userService 类描述")
public class UserService {
    public UserService() {
        System.out.println("Constructor from userService");
    }
}
