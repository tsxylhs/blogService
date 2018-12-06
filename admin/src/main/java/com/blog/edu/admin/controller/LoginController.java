package com.blog.edu.admin.controller;

import com.blog.edu.core.entity.User;
import com.edu.common.code.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName LoginController
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-20
 **/
@RestController
@Log4j2
@Api(value = "用户登录验证")
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/")
    @ApiOperation(value = "用户登录接口")
    @ApiImplicitParam(paramType="longinin")
    public Result login(@RequestBody User user){

        return Result.ok();
        }
    @PutMapping("/")
    @ApiOperation(value = "用户登录信息")
    @ApiImplicitParam(paramType = "login", name = "User", required = true, dataType = "user")
    public Result update(@RequestBody User user) {
           return Result.ok();
           
    }

}