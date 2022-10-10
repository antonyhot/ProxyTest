package com.proxy.cglibproxy.sample;

import net.sf.cglib.proxy.Enhancer;

public class TestCgLib {

    public static void main(String[] args) {
        UserDao dao = (UserDao)LogInterceptor.newInstance(UserDao.class);
        dao.select();
        dao.update();

//        UserDao userDao = new UserDao();
//        LogInterceptor logInterceptor = new LogInterceptor();
//        Enhancer e = new Enhancer();
//        e.setSuperclass(UserDao.class);
//        e.setCallback(logInterceptor);
//
//        UserDao interceptDao = (UserDao) e.create();
//        interceptDao.select();
//        interceptDao.update();
    }
}
