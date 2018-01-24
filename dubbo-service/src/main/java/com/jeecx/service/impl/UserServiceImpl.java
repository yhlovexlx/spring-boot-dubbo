package com.jeecx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jeecx.bean.User;
import com.jeecx.dao.UserDAO;
import com.jeecx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ===========================
 * Created with IntelliJ IDEA.
 * User：yanghl
 * Date：2018/1/21
 * Time：19:07
 * ===========================
 */
@Service(interfaceClass=UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void register(User user) {
        userDAO.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDAO.findOne(id);
    }
}
