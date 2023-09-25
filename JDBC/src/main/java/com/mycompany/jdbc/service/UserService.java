/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.jdbc.service;

import com.mycompany.jdbc.dao.UserDao;
import com.mycompany.jdbc.model.User;

/**
 *
 * @author minnie
 */
public class UserService {

    public User login(String name, String password) {
        UserDao userDao = new UserDao();
        User user = userDao.getByName(name);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

}
