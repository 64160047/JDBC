/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc;
import com.mycompany.jdbc.model.User;
import com.mycompany.jdbc.service.UserService;


/**
 *
 * @author minnie
 */
public class TestUserService {
     public static void main(String[] args) {
        UserService userService = new UserService();
        User user = userService.login("user2", "password");
        if(user!=null) {
            System.out.println("Welcome user : " + user.getName());
        } else {
            System.out.println("Error");
        }
    }


    
}
