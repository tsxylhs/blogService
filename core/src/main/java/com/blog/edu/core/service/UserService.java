package com.blog.edu.core.service;

import com.blog.edu.core.entity.User;
import com.edu.common.code.model.Result;
import com.edu.common.code.page.PageRequest;

import java.util.List;


/**
 * @ClassName UserService
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-11
 **/
public interface UserService {
     Result list(PageRequest pageRequest);
     User get(Long id);
     int update(User user);
}

