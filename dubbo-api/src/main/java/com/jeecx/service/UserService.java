package com.jeecx.service;

import com.jeecx.bean.User;

/**
 * ===========================
 * Created with IntelliJ IDEA.
 * User：yanghl
 * Date：2018/1/21
 * Time：19:04
 * ===========================
 */
public interface UserService {

    void register(User user);

    User getUserById(Integer id);
}
