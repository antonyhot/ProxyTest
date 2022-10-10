package com.proxy.staticproxy.sample;

import com.proxy.service.UserService;
import com.proxy.service.UserServiceImpl;

public class TestStaticProxy {

    public static void main(String[] args) {
        UserService userServiceImpl = new UserServiceImpl();
        UserService proxy = new UserServiceProxy(userServiceImpl);

        proxy.select();
        proxy.update();
    }
}
