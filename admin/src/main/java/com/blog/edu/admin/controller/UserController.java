package com.blog.edu.admin.controller;

import com.blog.edu.core.entity.User;
import com.blog.edu.core.service.UserService;
import groovy.util.logging.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-11
 **/
@RestController
@Log4j2
@RequestMapping("user")
public class UserController {
@Autowired
    UserService userService;
    @GetMapping("/{id}")
    public User get(@PathVariable Long id){
        return userService.get(id);
    }
}
