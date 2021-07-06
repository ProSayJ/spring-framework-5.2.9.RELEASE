package com.prosayj.basecode.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * IndexService
 *
 * @author yangjian@bubi.cn
 * @date 2020-04-14 下午 02:18
 * @since 1.0.0
 */
@Component
public class IndexService {
    @Autowired
    private UserService userService;

    public IndexService() {
        System.out.println("Constructor from indexService");
    }


}
