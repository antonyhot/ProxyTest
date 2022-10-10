package com.proxy.service;

public class UserServiceImpl implements UserService {

    @Override
    public void select() {
        System.out.println("select method is called");
    }

    @Override
    public void update() {
        System.out.println("update method is called");
    }
}
