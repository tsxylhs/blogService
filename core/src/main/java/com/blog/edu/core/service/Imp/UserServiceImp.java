package com.blog.edu.core.service.Imp;

import com.blog.edu.core.entity.User;
import com.blog.edu.core.entity.UserExample;
import com.blog.edu.core.mapper.UserMapper;
import com.blog.edu.core.service.UserService;
import com.edu.common.code.model.Result;
import com.edu.common.code.page.PageData;
import com.edu.common.code.page.PageRequest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName UserServiceImp
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 18-9-11
 **/
@Log4j2
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

    @Override
    public Result list(PageRequest pageRequest) {
        PageHelper.offsetPage(pageRequest.getStart(), pageRequest.getOffset(), true);
        UserExample ex=new UserExample();
        UserExample.Criteria  c= ex.createCriteria();
        List<User> users=userMapper.selectByExample(ex);
        log.info("asdf");
        return Result.ok(
                new PageData(new PageInfo<>(users).getTotal(), pageRequest.getPage(), pageRequest.getPageSize()),
                users);
    }
}
