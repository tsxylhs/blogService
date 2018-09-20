package com.blog.edu.admin.controller;

import com.blog.edu.core.entity.User;
import com.edu.common.code.model.Result;
import groovy.util.logging.Log4j2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-20
 **/
@RestController
@Log4j2
@RequestMapping("login")
@Api(value = "用户登录验证")
public class LoginController {
    @PutMapping("/")
    @ApiOperation(value = "用户登录信息")
    @ApiImplicitParam(paramType = "login", name = "User", required = true, dataType = "user")
    public Result update(@RequestBody User user) {
           return Result.ok();
    }
}