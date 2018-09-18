package com.blog.edu.core.service.Imp;

import com.blog.edu.core.entity.User;
import com.blog.edu.core.mapper.UserMapper;
import com.blog.edu.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImp
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-11
 **/
@Service
public class UserServiceImp  implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User get(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
