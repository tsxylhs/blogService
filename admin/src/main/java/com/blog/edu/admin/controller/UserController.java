package com.blog.edu.admin.controller;

import com.blog.edu.core.entity.User;
import com.blog.edu.core.service.UserService;
import groovy.util.logging.Log4j2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "用于用户的curd")
public class UserController {
@Autowired
    UserService userService;
    @GetMapping("/{id}")
    @ApiOperation(value = "根据用户ｉｄ查询用户信息")
    @ApiImplicitParam(paramType = "query" ,name = "id" ,value="用户id",required = true,dataType = "long")
    public User get(@PathVariable Long id){
        return userService.get(id);
    }
}
