package com.practice.spring5.service;

import com.practice.spring5.dao.UserDao;

public class UesrService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...");
        userDao.update();
    }
}
